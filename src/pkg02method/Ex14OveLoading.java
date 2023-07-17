package pkg02method;

public class Ex14OveLoading {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.add(10, 20);
        calc.add("안", "녕");
    }
}


class Calc {
    void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    void add(String arr1, String arr2) {
        System.out.println(arr1 + arr2);
    }

    boolean add(boolean b1, boolean b2) {
        return b1 || b2;
    }


}
