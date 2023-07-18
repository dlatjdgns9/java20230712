package pkg02method;

public class ExercisePrintTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 5-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
