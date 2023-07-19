package pkg04class;

public class Ex04SingleExtends {
    public static void main(String[] args) {

    }
}

class Phone {
    String btnCall;
    int numberKey;

    void call() {

    }

    void msg() {

    }

    void power() {

    }
}

class Computer {
    int numberKey;
    int alphabetKey;

    void process() {

    }

    void power() {

    }
}

//중복되는 속성과 기능이 발생할 수 있으므로 다중상속을 불허
//class SmartPhone extends Phone, Computer { }

//자바는 단일 상속만 허용
class SmartPhone extends Phone {
    Computer computer;
}