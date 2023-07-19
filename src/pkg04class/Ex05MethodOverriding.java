package pkg04class;

import java.util.Objects;

public class Ex05MethodOverriding {
    public static void main(String[] args) {
        Data d1 = new Data(1);
        Data d2 = new Data(1);
        Car car = new Car();

        System.out.println(d1.equals(car));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 == d2);

        String str1 = "abc";
        System.out.println(str1);
    }
}


class Data {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    /*@Override
    public String toString() {
        return String.valueOf(value);
    }*/

    //클래스의 인스턴스를 비교해서 동일화시킬 경우
    //hashCode()와 equals()를 재정의 해줘야 한다.
    @Override
    public int hashCode() {
        //HashCode 값이 동일할 때 HashMap, HashSet에서 적용될 때 불이익을 받지 않는다.
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return data.value == this.value;
        }
        return false;
    }
}