package pkg02method;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Ex11While {
    public static void main(String[] args) {
        int tot = 0;
        int i=0;
        while (i < 11) {
            tot += i;
            i++;
            //System.out.println(tot);
        }

        int rand = (int)(Math.random() * 100) + 1;
        System.out.println(rand);


        int count=1;
        while (true) {
            int input = 0;
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요 : "));
            } catch (Exception e) {
                System.out.println("숫자가 아닙니다. 다시 입력 바랍니다.");
                continue;
            }

            if (input > rand) {
                System.out.println("작다");
                count++;
            } else if (input < rand) {
                System.out.println("크다");
                count++;
            } else {
                System.out.println(count + "번만에 맞추셨습니다.");
                break;
            }
        }


        /*//가위바위보 게임
        Random random = new Random();
        while (true) {
            int com =random.nextInt(3) + 1; //가위=1, 바위=2, 보=3
            System.out.println("가위 바위 보!");
            String userInput = JOptionPane.showInputDialog("가위 바위 보! (게임종료는 : 0): ");
            if (userInput.equals("0")) {
                break;
            }

            if (userInput.equals("가위") && com==1) {
                System.out.println("비겼습니다.");
            } else if (userInput.equals("가위") && com == 2) {
                System.out.println("졌습니다.");
            } else if(userInput.equals("가위") && com ==3){
                System.out.println("이겼습니다.");
            }

            if (userInput.equals("바위") && com==1) {
                System.out.println("이겼습니다.");
            } else if (userInput.equals("바위") && com == 2) {
                System.out.println("비겼습니다.");
            } else if(userInput.equals("바위") && com ==3){
                System.out.println("졌습니다.");
            }

            if (userInput.equals("보") && com==1) {
                System.out.println("졌습니다.");
            } else if (userInput.equals("보") && com == 2) {
                System.out.println("이겼습니다.");
            } else if(userInput.equals("보") && com ==3){
                System.out.println("비겼습니다.");
            }
        }*/

       /* Scanner sc = new Scanner(System.in);
        do{
            System.out.println("메뉴를 선택하세요 : ");
            System.out.println("1) 회원등록");
            System.out.println("2) 회원검색");
            System.out.println("3) 종료");
            String input = sc.next();
            System.out.printf("%s 번을 선택하였습니다.\n", input);
            if (input .equals("3")) {
                break;
            }
        }while(true);
*/
    }
}
