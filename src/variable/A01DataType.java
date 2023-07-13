package variable;

public class A01DataType {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("1" + car.engine);

        car.engine = new Engine();
        System.out.println("2" + car.engine);
        System.out.println("3" + car.engine);

        System.out.println(car.wheel);

    }
}


class Car{
    int wheel;
    Engine engine ;
    void express() {
        System.out.println("자동차 바퀴 수 = " + wheel);
    }
}

class Engine{
    int gitong;

}