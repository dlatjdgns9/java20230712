package pkg05JavaLang;

import java.util.Arrays;

import static java.lang.Math.*;

public class Ex02Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.1)); //올림
        System.out.println(floor(10.9)); //내림
        System.out.println(Math.round(0.5)); //반올림
        System.out.println(Math.round(-1.5));

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*5)+1;
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println(Math.rint(1.2)); //가장 가까운 값
        System.out.println(Math.rint(1.5));
        System.out.println(Math.rint(-1.2));
        System.out.println(Math.rint(-1.5));


        int i3 = Integer.parseInt("10"); //문자열을 숫자로 변환 10진수
        i3 = Integer.parseInt("1010", 2); //2진수
        System.out.println(i3);
        i3 = Integer.parseInt("1010", 8); //8진수
        System.out.println(i3);
        i3 = Integer.parseInt("1010", 16);//16진수
        System.out.println(i3);

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        //wrapper class 형변환 발생
        Object obj = 10; //기본형 -> 참조형 autoboxing
        Integer integer = Integer.valueOf(10);
        System.out.println(obj == integer);
        System.out.println(obj.getClass().getSimpleName());
        System.out.println((Object) integer.getClass().getSimpleName());
        int i1 = (int) obj; //unboxing 참조형 -> 기본형
        int i2 = integer; // 기본형 -> 참조형
        int n1 = Integer.parseInt("123"); //문자열을 int로 형변환 (기본형)
        int n2 = Integer.valueOf("123"); //문자열을 Integer로 형변환 (참조형)
        System.out.println(n2);
        Integer integer2 = (Integer) 1000;
    }
}
