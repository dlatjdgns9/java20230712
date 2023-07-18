package pkg02method;

public class Exercise113p {
    public static void main(String[] args) {
        int count=0;

        while (true) {
            int rand = (int)(Math.random() *6)+1;
            count++;
            if (rand == 6) {
                break;
            }
        }
        System.out.println("횟수 : " + count + "번");
    }
}
