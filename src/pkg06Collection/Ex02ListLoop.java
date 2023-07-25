package pkg06Collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.function.Consumer;

public class Ex02ListLoop {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(true);
        arrayList.add("hello");
        arrayList.add(new Date());
        System.out.println(arrayList);
        arrayList.clear(); //ArrayList 모두 삭제
        System.out.println(arrayList);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            sum += (int) arrayList.get(i);
        }
        System.out.println("ArrayList = " + arrayList);
        System.out.println("ArrayList 원소 총합 : " + sum);

        //향상된 for문
        sum = 0;
        for (Object obj : arrayList) {
            sum += (int) obj;
        }
        System.out.println(sum);


        //2. 향상된 for문
        arrayList.forEach(new Consumer() {
            int sum = 0;

            @Override
            public void accept(Object o) {
                sum += (int) o;
            }
        }); //익명 객체라서 sum에 접근하기 어려워서 내부클래스를 만듬

        class InnerClass implements Consumer {
            int sum = 0;

            @Override
            public void accept(Object o) {
                sum += (int) o;
            }
        }

        InnerClass ic = new InnerClass();
        arrayList.forEach(ic);

        //4. iterator 접근방법
        sum = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sum += (int) it.next();
        }
        System.out.println(sum);
    }
}
