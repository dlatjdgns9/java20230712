package pkg02method;

public class Ex03ArithmeticOp {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        System.out.println(n1 + n2);
        System.out.println(n1 % n2);
        math(n1, n2);
    }


    static void math(int n1, int n2) {
        System.out.println(n1 + "을 " + n2 + "으로 나누었을 때 몫은"  + n1/n2 + " 나머지는" + n1%n2);
    }
}
