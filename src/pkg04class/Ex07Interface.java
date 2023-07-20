package pkg04class;

public class Ex07Interface {
    public static void main(String[] args) {
        Hydrarisk hydrarisk = new Hydrarisk();
        hydrarisk.attack();
    }
}


//다중상속 안됨
//class Hydrarisk extends AttackAir, AttackGround{ }

interface AttackAirable {
    final int LEVEL = 1;  //상수선언시 가능, public static 생략 가능
    public abstract void attack();  //추상 메서드 public abstract는 생략가능
}

interface AttackGroundable {
    final int LEVEL = 2;
    void attack(); //추상 메서드
}

class Hydrarisk implements AttackAirable, AttackGroundable {
    void move() { }

    void upgrade(String type) {

    }

    String type = "Lurker";
    @Override
    public void attack() { //중복되더라도 body가 없기 때문에 재정의 하면 된다.
        upgrade(type);
        //상수는 interface명.상수 로 지정되기 때문에 중복되어도 상관 없다.
        System.out.println(AttackGroundable.LEVEL + AttackAirable.LEVEL);
    }
}

class AttackGround { }

class AttackAir { }