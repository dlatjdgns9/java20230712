package pkg01variable;

import util.Util;

public class Ex05IntLong {
    public static void main(String[] args) {
        byte b1 = 100; // byte 표현범위는 -128 ~ 127
        byte b2 = 100;
        Util.typeof(b1 + b2);
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);


        short s1 = 20000; //-32768 ~ 32767
        short s2 = 20000;
        Util.typeof(s1+s2);
        short s3 = (short)(s1+s2);
        Util.typeof(s3);
        System.out.println(s3);

        int i1 = 10;
        long l1 = (long)10; //묵시적인 형변환
        Util.typeof(i1+l1);

        float f1 = 0.1f;
        double d1 = 0.1;
        Util.typeof(l1 + f1);
    }

}
