package pkg10Thread;

public class Ex04Daemon {
    static boolean autoSave = false;
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        daemon.setDaemon(true); //main이 끝나면 같이 끝나게 함
        daemon.start();
        for (int i = 0; i < 10; i++) {
            try {Thread.sleep(1000);} catch (Exception e) {}
            if (i==5) autoSave = !autoSave;
            System.out.println(i);
        }
    }
    static private class Daemon extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (autoSave) System.out.println("작업 중이신 파일이 자동되었습니다");
            }
        }
    }
}
