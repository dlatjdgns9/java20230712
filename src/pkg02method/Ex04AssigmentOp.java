package pkg02method;

public class Ex04AssigmentOp {
    public static void main(String[] args) {
        int n = 0;
        int step = 3;
        System.out.println(n = n + step);
        System.out.println(n = n + step);
        System.out.println(n = n + step);

        for(int i=0; i<=10 ; i += 3){
            System.out.println(i);
            System.out.println(i%step);
        }
    }
}
