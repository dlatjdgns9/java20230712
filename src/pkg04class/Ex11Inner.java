package pkg04class;

public class Ex11Inner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InstanceInner oi = new Outer().new InstanceInner();
        Outer.StaticInner os = new Outer.StaticInner();
        System.out.println(oi.iv);
        System.out.println(os.iv);
        System.out.println(os.sv);

        System.out.println(Outer.StaticInner.sv); //static이라서 인스턴스를 생성하지 않고도 접근가능

        Outer.InnerInterface oii = new Outer.InnerInterface() {
            @Override
            public void innerMethod() {
                System.out.println("Outer.InnerInterface");
            }
        };
        oii.innerMethod();
    }
}


class Outer {
    //내부 클래스르 사용하는 목적 : 외부에서 사용될 일이 없고, 내부적으로만 사용할 경우
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int sv = 300;
    }

    void outerMethod() {
        class LocalInner {
            int localInnerVar = 500;
        }
    }

    interface InnerInterface {
        void innerMethod();
    }
}

