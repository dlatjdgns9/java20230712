package pkg04class;

public class Ex03Extends {
    public static void main(String[] args) {
        //Terran terran = new Terran();
        Marine m1 = new Marine();
        System.out.println(m1.getTribe());
        System.out.println(m1.getCharacterName());
        System.out.println(m1);

        Marine m2 = new Marine();
        System.out.println(m1.getTribe());
        System.out.println(m1.getCharacterName());
        System.out.println(m2);

        Dragon d1 = new Dragon();
        System.out.println(d1.getTribe());
        System.out.println(d1.getCharacterName());
        System.out.println(d1);

        System.out.println(m1 instanceof Terran);
        System.out.println(m1 instanceof Unit);
        System.out.println(d1 instanceof Protoss);
        System.out.println(d1 instanceof Unit);

        System.out.println(d1 instanceof Object);
        //Unit unit = new Unit();
        //추상클래스는 인스턴스 생성불가, 상속받은 후 사용 가능
    }
}

abstract class Unit {
    private int hp;
    private int x, y;
    private String tribe, characterName;

    public Unit(String tribe, String characterName) {
        this.tribe = tribe;
        this.characterName = characterName;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("move(%d, %d) %n", x, y);
    }
    public void stop() {
        System.out.printf("move(%d, %d) %n", x, y);
    }

    public String getTribe() {
        return tribe;
    }

    public int getHp() {
        return hp;
    }

    public String getCharacterName() {
        return characterName;
    }
}



abstract class Terran extends Unit{
    public Terran(String characterName) {
        super("Terran", "Marine"); //super는 자기 부모의 생성자를 가리킴
    }
}

class Marine extends Terran {
    public Marine() {
        super("Marine");
    }
    public void steamPack() {

    }
}



abstract class Protoss extends Unit{
    public Protoss(String characterName) {
        super("Protoss", "Dragon"); //super는 자기 부모의 생성자를 가리킴
    }
}

class Dragon extends Protoss {
    public Dragon() {
        super("Dragon");
    }
}