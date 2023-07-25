package pkg06Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);set.add(1);set.add(2);set.add(3);
        System.out.println(set);

        //1. 향상된 for
        for (int i : set) {
            System.out.println(i);
        }

        //2. iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println();
        Set<Integer> lotto = new HashSet<>();
        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println(lotto);
    }
}
