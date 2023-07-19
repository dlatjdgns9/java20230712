package pkg04class;

public class Ex02HasA_IsA {
    public static void main(String[] args) {
        //Car가 Engine을 포함하되 공통된 속성과 기능이 없는 관계(공유하지 않음)
        //has - a 관계
        Car c = new Car();
        Engine engine = new Engine();
        System.out.println(c.engine.gitong);
        System.out.println(engine.gitong);

        //상속관계는 자식이 부모를 포함하되 공통된 속성과 기능을 공유
        //is - a 관계
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println();
    }
}


class Car {
    Engine engine;
}

class Engine {
    int gitong = 4;
}



class Parent {
    String habit;
}

class Child extends Parent{

}