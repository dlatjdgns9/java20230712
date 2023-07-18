package pkg02method;

import javax.swing.*;

public class ExerciseRCP {
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임을 시작합니다.");

        while (true) {
            int rand = (int)(Math.random() * 3);
            int input = Integer.parseInt(JOptionPane.showInputDialog("안내면 진다 가위(0) 바위(1) 보(2)!")); //가위(0) 바위(1) 보(2)
            int result = input - rand;

            if (result == 0) {
                System.out.println("비겼습니다.");

            } else if (Math.abs(result) == 1) {  //절대값
                System.out.println("졌습니다.");

            } else if (Math.abs(result) == 2) {
                System.out.println("이겼습니다.");
            } else {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
