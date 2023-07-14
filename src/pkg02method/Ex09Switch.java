package pkg02method;

import java.util.Scanner;

public class Ex09Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는  계절의 월을 입력 : ");
        int month = sc.nextInt();
        String season = "";

        System.out.printf("입력하신 월은 %d월 입니다.%n", month);

        switch(month){
            case 3,4,5:
                season = "봄"; break;
            case 6,7,8:
                season = "여름"; break;
            case 9,10,11:
                season = "가을"; break;
            case 12,1,2:
                season = "겨울"; break;
        }
        System.out.println(month + "월은 " + season + " 입니다.");

        sc = new Scanner(System.in);
        System.out.print("당신의 성을 입력하시오 : ");
        String input = sc.next();

        switch (input) {
            case "김":
                System.out.println("Kim"); break;
            case "이":
                System.out.println("Lee"); break;
            case "박":
                System.out.println("Park"); break;
            case "강":
                System.out.println("Kang"); break;
        }

    }
}
