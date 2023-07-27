package pkg10Thread;

import java.util.TreeMap;

public class Ex02Multi {
    static long startTime = System.currentTimeMillis();


    public static void main(String[] args) {
        long midTime = System.currentTimeMillis();

        new Thread2().start();

        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.println("- 걸린 시간: " + (System.currentTimeMillis() - startTime));
    }


}


class Thread2 extends Thread {
    long startTime = System.currentTimeMillis();
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("| 걸린 시간: " + (System.currentTimeMillis() - startTime));
    }
}
