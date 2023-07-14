package pkg02method;

public class Ex01MethodDeclare {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.eat();

        int count = foo.count();
        System.out.println(count);

        boolean sleep = foo.sleep();
        System.out.println(sleep);
    }
}

class Foo {
    private int ea;
    private boolean sleepState;

    void eat() {

    }

    int count() {
        return ea;
    }

    boolean sleep() {
        return sleepState;
    }

    Foo whoIs() {
        return new Foo();
    }
}

