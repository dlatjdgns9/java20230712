package pkg04class;

public class Ex09Abstract {
    public static void main(String[] args) {
        //abstract의 목적은 정의가 되어 있지 않기 때문에 반드시 재정의 하여야 한다.
        //왜 그러면 재정의를 하지 않는냐 => 기준을 잡기가 용이하기 때문이다.
        // Abstract abstract = new Abstract();  // 스스로 인스턴스 생성 불가

        AbstractExtends abstractExtends = new AbstractExtends(); //extends 후 사용
        InterfaceImplements interfaceImplements = new InterfaceImplements(); //implement 후 사용



        Interface interfaceClass = new Interface() { //익명객체가 선언되어 인스턴스 생성가능
            @Override
            public void interfaceMethod() {

            }
        };

        Abstract abstractClass = new Abstract() { //익명객체가 선언되어 인스턴스 생성가능
            @Override
            void commonMethod() {
                super.commonMethod();
            }
        };


    }
}

abstract class Abstract { //abstract는 자체만으로 인스턴스 생성불가.  반드시 상속후 생성
    int num =10;
    boolean power;
    final double PI = 3.14;

    void commonMethod() {

    }
}

interface Interface { //interface 자체만으로 인스턴스 생성 불가.  반드시 implement후 생성
    void interfaceMethod();
}

class AbstractExtends extends Abstract {

}

class InterfaceImplements implements Interface {
    @Override
    public void interfaceMethod() {

    }
}
