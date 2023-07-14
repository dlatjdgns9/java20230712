package pkg02method;

public class Ex07ElvisOp {
    public static void main(String[] args) {
        boolean r = true;
        int num = 10;

        System.out.println(r?"참":"거짓");
        System.out.println(num>10?"크다":"작거나 같다");

        int score = 97;
        System.out.println(score >= 90 ? score%10>4?"A+" : "A0" : "F");
    }
}
