package pkg04class;

public class Ex12NamedLoop {
    public static void main(String[] args) {

        Loop1:
        for (int i = 0; i < 3; i++) {
            System.out.println("첫번째 for문" + i);
            for (int j = 0; j < 10; j++) {
                /*if(j==3) break;
                if(j==3) break Loop1;*/
                if(j==3) continue Loop1;
                System.out.println("두번째 for문" + j);
            }
        }

    }
}
