package pkg05JavaLang;

import util.Util;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

public class Ex04String {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = new String("hello");
        String str2 = "hello";
        String str3 = String.valueOf("hello");

        System.out.println("str == str1 : " + (str == str1));
        System.out.println("str == str2 : " + (str == str2));
        System.out.println("str == str3 : " + (str == str3));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println(str.equals(str1));
        Util.typeof("hello world");
        System.out.println(str.equals("HELLO")); //대소문자 구분있는 비교
        System.out.println(str.equalsIgnoreCase("HellO")); //대소문자 구분없이 비교

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println("str.intern() : " + str.intern()); //
        System.out.println("str.intern() : " + str1.intern()); //
        System.out.println("str.intern() : " + str2.intern()); //
        System.out.println("str.intern() == str1.inter() : " + (str.intern() == str1.intern()));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); //한글자 씩
        }
        System.out.println(str.compareTo("Hello"));
        System.out.println(str.compareTo("world"));
        System.out.println(str.concat(" world"));

        //compareTo()
        //참조형 변수가 숫자일 때 크면 1리턴, 작으면 -1리턴, 같으면 0리턴
        System.out.println(Integer.valueOf(3).compareTo(3));
        System.out.println(Integer.valueOf(3).compareTo(2));
        System.out.println(Integer.valueOf(3).compareTo(4));
        System.out.println(str); //String의 인스턴스는 변경이 안된다.
        System.out.println(str.contains("hell")); //포함하는가
        System.out.println(str.endsWith("o")); // 끝나는 문자열에대한 참거짓 반환

        System.out.println(str.indexOf("ll")); // "ll"이 있는 인덱스를 반환
        System.out.println("hello world".indexOf("l",5));  //index가 5 이후부터 l이 있는 index를 반환
        System.out.println("hello world".lastIndexOf("l"));

        System.out.println(str.replace("l", "k"));
        System.out.println(str.replace("o", ""));
        System.out.println(str.replace("l", "o"));

        String[] arr = "I am a boy".split(" "); //공백을 기준으로 분리
        System.out.println(Arrays.toString(arr));

        String name = "index.abc.html";
        System.out.println(name.substring(name.lastIndexOf(".") + 1)); //부분 추출
        System.out.println(name.substring(name.indexOf(".")+1, name.lastIndexOf(".")));
        System.out.println(name.substring(6,9));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase().toLowerCase());

        System.out.println("    blan    k    ".trim()); //앞뒤 공백제거, 가운데는 안지워짐
        System.out.println("    blan    k    ".trim().replace(" ", ""));

        System.out.println(String.valueOf(1)); // 숫자가 문자열로 바뀐다.
        System.out.println(String.valueOf(0b10));
        System.out.println(String.valueOf(0010));
        System.out.println(String.valueOf(0xa0));

        StringJoiner sj = new StringJoiner(",", "{", "}");
        for (String s : arr) {
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}
