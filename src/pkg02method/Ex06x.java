package pkg02method;

import javax.swing.*;

public class Ex06x {
    public static void main(String[] args) {
        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        int remainColorPen = colorPen % studentCount;

        System.out.println("학생당 나눠가지는 색연필수 : " + divColorPen);
        System.out.println("똑같이 나눠 가지고 남은 볼펜수 : " + remainColorPen);

        int age= 6;
        int height = 120;
        boolean parent = true;
        boolean hearchDease = false;
        if((age >= 6 && height >= 120 || height >=120 && parent) && hearchDease == false){
            System.out.println("입장 가능");
        }

        int year =2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("윤년입니다.");
        }

        int price = 187000;
        int oman = price / 50000;
        int ilman = price % 50000 / 10000;
        int ochun = price % 10000 / 5000;
        int ilchun = price % 5000 / 1000;

        System.out.println("5만원짜리 : " + oman);
        System.out.println("1만원짜리 : " + ilman);
        System.out.println("5천원짜리 : " + ochun);
        System.out.println("천원짜리 : " + ilchun);

        int number = Integer.parseInt(JOptionPane.showInputDialog("양의 정수를 입력하세요 : "));
        int result = number - (number % 100);
        System.out.println(result);

    }
}
