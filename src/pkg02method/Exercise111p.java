package pkg02method;

public class Exercise111p {
    public static void main(String[] args) {
        int sum = 0;
        int even =0;
        int odd = 0;
        for (int i = 1; i <= 100; i++) {
            int k = i;
            if((i) % 5 ==0) {
                System.out.println(i);
                sum += i;
            }
            if (k % 2 == 0) {
                even += k;
            } else if (k%2 == 1) {
                odd += k;
            }
        }
        System.out.println("총합 : " + sum);
        System.out.println("1부터 100까지의 짝수 총합 : " + even);
        System.out.println("1부터 100까지의 홀수 총합 : " + odd);
    }
}
