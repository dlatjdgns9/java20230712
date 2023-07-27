package pkg10Thread;

public class Ex06Join {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        //join()이 없으면 sum: 0을 출력한다. -> 스레드를 기다려주지 않음.
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            System.out.println("sum: " + sumThread.getSum());
        }
    }
}


class SumThread extends Thread {
    private long sum;
    public long getSum() {
        return sum;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
    }
}