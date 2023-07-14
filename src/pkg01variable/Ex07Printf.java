package pkg01variable;

import util.Util;

public class Ex07Printf {
    public static void main(String[] args) {
        System.out.println("");

        System.out.print("Kenshi ");
        System.out.print("Lady\n");

        System.out.printf("원주율 파이는 %f %n", 3.141592);
        System.out.printf("원주율 \"파이\"는 %1.2f %n", 3.141592);
        System.out.printf("합계 : %d %n", 230);
        System.out.printf("%b or %b %n", true, false);


        System.out.printf("10진수 : %d, 8진수 : %o, 16진수 : %x %n", 10, 10, 10);

        int var = 10;
        var num = true;
        Util.typeof(num);
    }
}
