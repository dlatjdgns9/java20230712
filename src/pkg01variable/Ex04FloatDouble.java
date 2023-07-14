package pkg01variable;

import util.Util;

public class Ex04FloatDouble {
    public static void main(String[] args) {
        float f1 = 0.0123456789f;
        float f2 = 0.1f;
        System.out.println(f1); //소수 7번째 자리까지 정밀도 가짐

        double d1 = 0.01234567890123456789;
        double d2 = 0.0d;
        System.out.println(d1); //소수 17번쨰 자리까지 정밀도 가짐

        float tot = (float)(f1 + d1); //명시적인 형변환
        //System.out.println(((Object) (d1 + f1)).getClass().getSimpleName()); // type 확인
        Util.typeof(f1+d1);
        System.out.println(tot);
    }
}
