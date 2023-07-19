package pkg04class;

import javax.swing.*;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        while (true) {
            int comParm = (int)(Math.random() * 2) + 1; //1,2 둘 수중 하나 랜덤 생성
            String userParm = JOptionPane.showInputDialog("손바닥(1), 손등(2), 게임종료(q/Q) 중 하나를 선택하시오: ");
            System.out.println("User Input : " + userParm);


            if (userParm.equals("1") && comParm == 1) {
                System.out.println("승리!");
            } else if (userParm.equals("1") && comParm ==2){
                System.out.println("패배");
            } else if (userParm.equals("2") && comParm ==1) {
                System.out.println("패배");
            } else if (userParm.equals("2") && comParm ==2) {
                System.out.println("승리");
            }else if (userParm.equals("q") || userParm.equals("Q")) {
                System.out.println("게임을 종료합니다.");
                break;
            } else if (!userParm.equals("1") && !userParm.equals("2") && !userParm.equals("q") && !userParm.equals("Q")) {
                System.out.println("1, 2, q, Q 중에서 선택해주세요");
            }
        }
    }
}
