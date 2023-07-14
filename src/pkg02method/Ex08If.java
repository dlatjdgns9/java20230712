package pkg02method;

import util.Util;

import javax.swing.*;

public class Ex08If {
    public static void main(String[] args) {
        //var input = JOptionPane.showInputDialog("점수 입력 : ");
        //Util.typeof(input);
        int score = Integer.parseInt(JOptionPane.showInputDialog("점수 입력 : "));
        String result = "";

        if(score >= 60){
            result = "success!";
        }
        else{
            result ="fail";
        }

        System.out.println(result);

        System.out.println(score>=60 ? "success!" : "fail!");

        if(score == 100){
            result = "A+";
        } else if(score >= 90){
            result = "A" + addScore(score);
        } else if( score >= 80){
            result ="B" + addScore(score);
        } else if(score>=70){
            result = "C" + addScore(score);
        } else if(score >= 60){
            result="D" + addScore(score);
        } else{
            result = "F";
        }

        System.out.println(result);

    }


    static String addScore(int score){
        return score%10 >=5 ? "+" : "0";
    }
}
