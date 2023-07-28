package pkg11lambda;

import java.util.function.Predicate;

public class Ex03Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i<100;
        Predicate<Integer> p2 = i -> i<200;
        Predicate<Integer> p3 = i -> i%2 == 0;
        Predicate<Integer> notP = p1.negate(); //i<100 => true인데  => false로 바꿈
        Predicate<Integer> all = notP.and(p2.or(p3));
        System.out.println(all.test(150));

        String str1 = "abc", str2 = "abc";
        Predicate<String> predicate = Predicate.isEqual(str1);
        System.out.println(predicate.test(str2));

    }
}
