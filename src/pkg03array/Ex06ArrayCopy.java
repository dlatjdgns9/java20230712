package pkg03array;

import java.util.Arrays;

public class Ex06ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a; //shallow copy 주소값을 저장해서 배열a의 원소값이 변경되면 b도 같이 변경된다.
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("=============");

        b = new int[a.length]; //deep copy a값을 변경해도 b값이 바뀌지 않음
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 3;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("=============");

        b = a.clone(); //deep copy
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("=============");

        int[] c = {1, 2, 3, 4, 5, 6, 7};
        int[] d = new int[7];
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.arraycopy(c,0,d,0,7);  //deep copy
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        c[0]=8;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}
