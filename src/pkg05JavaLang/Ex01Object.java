package pkg05JavaLang;

import java.util.Objects;

public class Ex01Object {
    public static void main(String[] args) {
        Object obj = new Object();
        MyObject myObject = new MyObject();
        String str = new String("abc");

        System.out.println(obj);
        System.out.println(str);

        //재정의하기전
        //System.out.println(myObject.toString());  //재정의 하기전에 .toString()메서드를 사용하면 myObject 주소값이 출력됨

        //toString을 재정의하면 myObject.toString()의 .toString()을 생략해도 컴파일러가 자동으로 붙여주기 때문에
        System.out.println(myObject); //toString을 재정의하고 객체myObject를 출력(sout)하면 주소값이 아닌 인스턴스의 값을 출력


        try {
            System.out.println(obj = myObject.clone()); //자부
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        MyObject myObject1 = new MyObject();
        System.out.println(myObject == myObject1); //주소값 비교
        System.out.println(myObject.equals(myObject1)); //값의 내용을 비교
    }
}


class MyObject implements Cloneable{
    int val = 100;

    @Override
    public String toString() {
        return val + "";
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) { }
        return (MyObject)obj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public boolean equals(Object obj) {
        MyObject myObject = null;
        if (obj instanceof MyObject) {
            myObject = (MyObject) obj;
        }
        return myObject.val == val;
    }
}