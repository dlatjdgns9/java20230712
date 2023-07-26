package pkg09Generics;

import java.util.ArrayList;

public class Ex01Generics {
    public static void main(String[] args) {
        // 1) 형변환을 생략하여 코드를 간략화 할 수 있다.
        // 2) 타입의 안정성을 도모할 수 있다.
        //ArrayList List = new ArrayList(); //제네릭스 미적용
        ArrayList<Ball> list = new ArrayList<>();  //제네릭스 적용

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 10) + 1;
            list.add(new Ball(rand));
        }

        for (int i = 0; i < 10; i++) {
            //제네릭스 미적용시
            //System.out.println(list.get(i)); //object타입
            //System.out.println(((Ball)(list.get(i))).number);
            //System.out.println(((Ball)(list.get(i))).getNumber()); //형변환 필수
            //System.out.println(list.get(i)); //형변환시 중복된 메서드에서 자손의 메서드를 사용


            //제네릭스 적용시
            System.out.println(list.get(i).getNumber());

        }
    }
}


class Ball {
    int number;

    public Ball(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }

    public int getNumber() {
        return number;
    }
}