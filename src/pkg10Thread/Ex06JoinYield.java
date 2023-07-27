package pkg10Thread;

public class Ex06JoinYield {
    static long startTime = System.currentTimeMillis();
    public static void main(String[] args) {
        Bar bar = new Bar();
        Hypen hypen = new Hypen();
        hypen.setPriority(7);
        bar.start(); hypen.start();

        try {
            hypen.join(); // join()을 실행한 스레드가 일시 정지
            bar.join();
            hypen.yield(); //yield()는 다른 스레드에게 실행을 양보하는 메서드
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("소요시간: " +(System.currentTimeMillis()-startTime));

    }
}

class Bar extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
    }

}

class Hypen extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
    }
}