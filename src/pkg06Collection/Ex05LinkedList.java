package pkg06Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex05LinkedList {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(2000000);
        List<String> ll = new LinkedList<>();

        System.out.println("===순차적 추가===");
        System.out.println(addSequntial(al));
        System.out.println(addSequntial(ll));
        System.out.println();
        System.out.println("===중간 추가===");
        System.out.println(addMiddle(al));
        System.out.println(addMiddle(ll));
        System.out.println();


        System.out.println("===중간 삭제===");
        System.out.println(removeMiddle(al));
        System.out.println(removeMiddle(ll));
        System.out.println();


        System.out.println("===순차적 삭제===");
        System.out.println(removeSequntial(al));
        System.out.println(removeSequntial(ll));
        System.out.println();

    }

    private static long addSequntial(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addMiddle(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(5000,i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long removeSequntial(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size()-1; i >= 0 ; i--) {  //Arraylist는 앞에서부터 지우는데 지우면 앞으로 자동으로 앞당겨지기 때문에 뒤에서부터 지운다.
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeMiddle(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
