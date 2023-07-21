package pkg04class;

public class ExExercise238p {
    public static void main(String[] args) {

    }
}

interface Attackable {
    void attack();
}
abstract class Characters implements Attackable{
    int hp;
    int power;

}




class Warrior extends Characters implements Attackable {
    int weapon;

    @Override
    public void attack() {
        System.out.println("공격");
    }

    public void defence(Object target) {
        System.out.println("방어");
    }
}

class Gladiator extends Characters{
    int shield;

    @Override
    public void attack() {
        System.out.println("공격");
    }
    public void powerAttack(Object target) {
        System.out.println("파워공격");
    }
}

class Wizard extends Characters{
    int heal;

    @Override
    public void attack() {
        System.out.println("공격");
    }
    public void healing(Object target) {
        System.out.println("치료마법");
    }
}
