package pkg03array;

import java.util.Arrays;

public class Exercise142p {
    public static void main(String[] args) {
        int[] score = {90, 80, 60, 100};
        int totalScore = 0;
        double avgScore = 0;

        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        avgScore = totalScore / score.length;

        System.out.println("합계 점수 : " + totalScore);
        System.out.println("평균 점수 : " + avgScore);


        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] num2 = new int[10];

        for (int i = 0; i < num1.length ; i++) {
            num2[i] = (int)(java.lang.Math.pow(num1[i],2));
        }

        System.out.println(Arrays.toString(num2));
    }
}
