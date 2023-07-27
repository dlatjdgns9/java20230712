package pkg10Thread;

public class Ex05SuspendResume {
    public static void main(String[] args) {
//        RumImpl r = new RumImpl();
//        Thread t1 = new Thread(r, "*");
//        Thread t2 = new Thread(r, "**");
//        Thread t3 = new Thread(r, "***");
//        t1.start(); t2.start(); t3.start();
//        try {
//            Thread.sleep(2000);
//            t1.suspend();
//            Thread.sleep(2000);
//            t2.suspend();
//            Thread.sleep(3000);
//            t1.resume();
//            t1.stop();
//            t2.stop();
//            Thread.sleep(2000);
//            t3.stop();
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        SusResThread r1 = new SusResThread();
        SusResThread r2 = new SusResThread();
        SusResThread r3 = new SusResThread();
        Thread t1 = new Thread(new SusResThread(), "*");
        Thread t2 = new Thread(new SusResThread(),"**");
        Thread t3 = new Thread(new SusResThread(),"***");
        t1.start(); t2.start(); t3.start();
        try {
            Thread.sleep(2000);
            r1.suspend();
            Thread.sleep(2000);
            r2.suspend();
            Thread.sleep(3000);
            r1.resume();
            r1.stop();
            r2.stop();
            Thread.sleep(2000);
            r3.stop();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RumImpl implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class SusResThread implements Runnable {
    //volatile은 CPU cache 저장된 값말고 MainMemory의 값을 읽어옴.
    volatile boolean suspend = false;
    volatile boolean stopped = false;

    @Override
    public void run() {
        while (!stopped) {
            if (!suspend) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " stopped!");
    }
    public void suspend() {
        suspend = true;
    }
    public void resume() {
        suspend = false;
    }
    public void stop() {
        stopped = true;
    }
}