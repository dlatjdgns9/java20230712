package pkg10Thread;

public class Ex03ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("t1 thread start");
                for (int i = 0; i < 50; i++) {
                    System.out.println("t1(" + i + ") ");
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("t2 thread start");
                for (int i = 0; i < 50; i++) {
                    System.out.println("t2(" + i + ") ");
                }
            }
        };


        //우선순위 지정
        t1.setPriority(7); t2.setPriority(3);
        t1.start(); t2.start();
        //스레드 우선순위는 기본값 : 5, 범위는 1~10,
        //운영체제에 따라서 우선순위가 7까지인 경우도 있다.
        //우선순위 숫자가 높으수록 우선순위 높다.
    }
}
