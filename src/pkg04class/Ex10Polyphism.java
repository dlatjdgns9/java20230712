package pkg04class;

import com.sun.jdi.VirtualMachineManager;

public class Ex10Polyphism {
    public static void main(String[] args) {
        //상속관계에서의 형변환
        Mammals[] mammals = {new Lion(), new Bat(), new Horse()};
        Birds[] birds = {new Boramea(), new Eagle(), new Duck()};

        //인터페이스에서의 형변환
        Flyable[] flyables = {new Bat(), new Boramea(), new Eagle()};
        Groundable[] groundables = {new Lion(), new Horse(), new Duck()};
    }
}


class Mammals {

}

class Lion extends Mammals implements Groundable{

}

class Horse extends Mammals implements Groundable{

}

class Bat extends Mammals implements Flyable{

}

class Birds {

}

class Boramea extends Birds implements Flyable{

}

class Eagle extends Birds implements Flyable{

}

class Duck extends Birds implements Groundable{

}

interface Groundable {

}

interface Flyable {

}