package pkg06Collection;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

public class Ex08TreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet(); //TreeSet은 자동 정렬된다.
        set.add(7);
        set.add(5);
        set.add(2);
        set.add(9);
        System.out.println(set);

        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(lotto);
        lotto.clear();

        Set<Ball> balls = new TreeSet<>();
        int[] nums = {5, 2, 4, 3, 1};
        String[] colors = {"red", "yello", "black", "blue", "orange"};
        for (int i=0;i<5;i++) {
            balls.add(new Ball(nums[i], colors[i]));
        }
        System.out.println(balls);


    }
}

class Ball implements Comparable {
    int num;
    String color;



    public Ball(int num, String color) {
        this.num = num;
        this.color = color;
    }


    @Override
    public String toString() {
        return num+"(" +color+ ")";
    }

    @Override
    public int compareTo(Object o) {
        Ball ball = (Ball) o;
//        return num - ball.num; //기본형이라서 빼기 적용
        return color.toLowerCase().compareTo(ball.color.toLowerCase()); //color는 참조형이라서
    }
}