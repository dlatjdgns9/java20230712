package pkg03array;

import java.util.Arrays;

public class Ex03Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int Idx = 0;
        while (true) {
            int ball = (int)(Math.random() * 45) +1;
            boolean insert = true;

            for (int i = 0; i < lotto.length; i++) {
                if (ball == lotto[i]) {
                    insert = false;
                    break;
                }
            }
            if (insert) {
                lotto[Idx++] = ball;
            }
            if (Idx == 6) {
                break;
            }

        }
        System.out.println(Arrays.toString(lotto));
    }
}
