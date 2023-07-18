package pkg02method;

public class Exercise112p {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (i + j == 6) {
                    System.out.printf("%d + %d = 6 \n", i ,j);
                }
            }
        }
    }
}
