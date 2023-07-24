package pkg05JavaLang;

public class Ex03WrapperClass {
    public static void main(String[] args) {
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

        //compareTo()
        //참조형 변수가 숫자일 때 크면 1리턴, 작으면 -1리턴, 같으면 0리턴
        System.out.println(Integer.valueOf(3).compareTo(3));
        System.out.println(Integer.valueOf(3).compareTo(2));
        System.out.println(Integer.valueOf(3).compareTo(4));

    }
}
