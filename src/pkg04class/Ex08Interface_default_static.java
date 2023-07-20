package pkg04class;

public class Ex08Interface_default_static {
    public static void main(String[] args) {
        //default 메서드와 static 메서드 정의 가능 -> java8버전부터 가능

    }
}


interface ISwim {
    public default void swim(){
        System.out.println("수영하다.");
    };
}

interface IBicycle {
    public default void ride() {
        System.out.println("자전거타다.");
    }
}


interface IMarathon {
    public default void marathon() {
        System.out.println("마라톤하다.");
    }
}

//interface의 default가 중복되는 경우는 재정의한다.(overriding)
//static은 접근할 때 클래스, 패키지명이라서 중복되어도 상관없다.
interface Triathlon extends ISwim, IBicycle, IMarathon {
    public default void complete() {
        swim();
        ride();
        marathon();
    }

    public static void start() {
        System.out.println("준비가 끝났다.");
    }
}