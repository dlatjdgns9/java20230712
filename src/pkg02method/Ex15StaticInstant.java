package pkg02method;

public class Ex15StaticInstant {
    static int num = 10;
    int val = 20;

    public static void main(String[] args) {
        System.out.println(num);  //static은 프로그램 시작전 method area 영역에 로딩
        //System.out.println(val); //instance는 heap영역에 로딩,요청되는 시점에 생성
        //check();
        diagnotice();
        System.out.println(Car.wheel);
        Car.stop();  //static 선언해서 인스턴스를 안만들어도 사용가능

        Car car = new Car();
        System.out.println(car.door);
        System.out.println(car.wheel);
        car.drive();
        car.stop();
        //static은 같은 static만 사용 : 미리 로딩되기 때문에
        //instance는 static, instance 사용 : instatnce 만들어지는 시점에 둘다 존재
    }

    void check() {
        System.out.println(num);
        System.out.println(val);
    }

    static void diagnotice() {
        System.out.println(num);
        //System.out.println(val);
    }

}

class Car{
    static int wheel;
    int door;

    void drive(){

    }
    static void stop() {

    }
}
