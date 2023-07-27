package pkg10Thread;

public class Ex06Yield {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (count < 2) {
                    System.out.println(Thread.currentThread().getName());
                    count++;
                    Thread.yield();
                }
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
