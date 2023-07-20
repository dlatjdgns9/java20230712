package pkg04class;

public class Ex05Casting {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.age);
        father.hard();

        Son son = new Son();
        System.out.println(son.age);
        son.hard();

        // 자 -> 부   상속관계일때 형 변환 발생
        Father father2 = new Son();
        father2.hard();
        System.out.println(father2.age);

        // 1) 상속관계일때 형 변환 발생시 자 -> 부 일경우 부모 인스턴스는 자식만의 속성과 기능을 사용 불가
        //father2.computer();
        //System.out.println(father2.license);

        // 2) 자부 ok, 부자 no, 자부자 ok
        // 부 -> 자   자식에게만 있고 부모에게 없는 속성들을 초기화할수가 없으므로 에러
        //Son son2 = new Father();
        Son son3 = (Son) father2;  //자부자  형변환 해주면 가능


        // 3) 상속관계에서 자부이면서 속성과 기능이 중복될 때
        System.out.println(father2.age); //속성은 부모의 속성을 따름
        father2.hard(); // 기능은 자식의 기능을 따름
    }
}

class Father {
    int age;

    public Father() {
        this.age = 50;
    }

    void hard() {
        System.out.println("아버지의 열심");
    }
}

class Mother {
    String dna;

    void love() {

    }
}


class Son extends Father{
    int age = 25;
    int license;
    void hard() {
        System.out.println("아들의 열심");
    }

    void computer() {
        System.out.println("프로그래밍");
    }
}


class Daughter extends Father{
    String dna;

    void hard() {
        System.out.println("딸의 열심");
    }
}