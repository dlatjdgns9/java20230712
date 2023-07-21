package pkg04class;

import java.util.Scanner;

public class Ex12TryCatch {
    public static void main(String[] args) {

        for (int i = 1; i < 8; i++) {
            System.out.println(i);
            if (i == 3) {
                try {
                    System.out.println(10/0);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }finally {
                    if (i == 6) {
                        System.out.println(i);
                    }
                }
            }
        }

        //Scanner sc = new Scanner(System.in);
        //int input = sc.nextInt();
        try {
            int input = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("숫자가 아닙니다.");
        }

    }
}
