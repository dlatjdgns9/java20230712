package pkg04class;

import java.io.IOException;

public class Ex14ExceptionExtends {
    public static void main(String[] args) {
        Child2 c = new Child2();
    }
}

class Parent2 {
    // 메서드 재정의 할 때 접근제어자의 범위는 좁으면 안됨, 같거나 넓어야 한다.
    protected void method() throws IOException, ArithmeticException {}
}


class Child2 extends Parent2{
    //상속받은 클래스(자식)에서 메서드 재정의 할 때 예외처리의 범위는 조상이 가진 에러 범위안에 있어야 한다.
    //protected void methode() throws ClassNotFoundException{} //다른예외 적용안됨
    //protected void methode(){} //없거나
    //protected void methode() throws IOException{} //적거나
    @Override
    protected void method() throws IOException, ArithmeticException{ //같거나

    }
}