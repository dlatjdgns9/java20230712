package pkg02method;

public class Ex02LogicOp {
    public static void main(String[] args) {
        Ex02LogicOp e = new Ex02LogicOp();
        System.out.println(e.addBool(true, false));
        System.out.println(multiplyBool(true, false));
        addBool2(true, false);
        xorBool(true, true);
    }

    private static void xorBool(boolean b1, boolean b2) {
        System.out.printf("%b ^ %b = %b", b1, b2, b1^b2);
    }

    boolean addBool(boolean b1, boolean b2) { //인스턴스를 생성해야만 호출이 가능
        return b1 || b2;  //논리합
    }

    static void addBool2(boolean b1, boolean b2){
        System.out.printf("%b || %b = %b %n", b1, b2, b1||b2);
    }

    static boolean multiplyBool(boolean b1, boolean b2) { //static메서드이므로 인스턴스를 생성하지 않아도 메서드를 사용할 수 있다.
        return b1 && b2;  //논리곱
    }
}
