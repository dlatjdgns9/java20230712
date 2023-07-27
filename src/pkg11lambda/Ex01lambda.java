package pkg11lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@FunctionalInterface
interface MyMethod{void doIt();}

@FunctionalInterface
interface MySqrt{int sqrt(int a);}

@FunctionalInterface
interface MyMax{int max(int a, int b);}



public class Ex01lambda {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Object");
            }
        };

        // 매개변수         메서드바디
        r = () -> System.out.println("Anonymous Object"); //{명령문이 하나면 중괄호 생략가능}
//      r = () -> {System.out.println("Anonymous Object");};  //중괄호 있을 때
//      r = () ->{}; //명령이 없는 경우에는 반드시 중괄호 표기
        Thread t = new Thread(r);
        t.start();

        MyMethod myMethod = new MyMethod() {
            @Override
            public void doIt() {
                System.out.println("MyMethod");
            }
        };
        myMethod = () -> { System.out.println(); };
        myMethod = () ->  System.out.println(); ;



        MySqrt mySqrt = new MySqrt() {
            @Override
            public int sqrt(int a) {
                return a*a;
            }
        };
        mySqrt = (int a) -> {return a*a;};
        mySqrt = (a) -> {return a*a;};
        mySqrt = a -> a*a;  //매개변수가 1개일때는 소괄호도 생략가능


        MyMax myMax = new MyMax() {
            @Override
            public int max(int a, int b) {
                return a>b?a:b;
            }
        };
        myMax = (int a,int b) -> {return a>b?a:b;};
        myMax = (a,b) -> a>b?a:b; //중괄호 생략시 리턴도 생략해야한다.
    }
}


class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JButton btn = new JButton("확인");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn.addActionListener(
                (ActionEvent e) -> {}
        );
        btn.addActionListener((e)->{});
        btn.addActionListener(e -> {});
    }
}

class lambdaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Lambda");
    }
}
