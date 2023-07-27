package pkg10Thread;

import javax.swing.*;

public class Ex01Thread {
    public static void main(String[] args) {
//        for (int i = 10; i > 0; i--) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println(i);
//        }
        //Thread를 상속 받았을 때
//        MyThread myThread = new MyThread();  myThread.start(); //이 줄을 줄여서 아래줄처럼 사용가능
//        new MyThread().start();



        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        t2.start();


        //Runnable을 임플리먼트 했을 때
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        //익명 객체로 선언될 때
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        String input = JOptionPane.showInputDialog("아무거나");


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("나의 쓰레드 시작");
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("나의 쓰레드 시작");
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }
    }
}