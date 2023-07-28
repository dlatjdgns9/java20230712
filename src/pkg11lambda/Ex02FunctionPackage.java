package pkg11lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex02FunctionPackage {
    //일반적으로 자주 쓰이는 메서드 형식을 4가지의 @Functuonalnterface형태로 만든 객체.
    //Java 8 버전에서 표준 API 형태의 함수형 인터페이스를 정의.
    public static void main(String[] args) {
        //1) 매개변수 없고 리턴타입이 있을 때
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100) + 1;
            }
        };
        supplier = () -> {return (int)(Math.random() * 100) + 1;};
        supplier = () -> (int) (Math.random() * 100) + 1;


        //2) 매개변수가 있고 리턴타입이 없을 때
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        consumer = (Integer i) -> {System.out.print(i+ " ");};
        consumer = (i) -> {System.out.print(i+ " ");};
        consumer = i -> {System.out.print(i+ " ");};
        consumer = i -> System.out.print(i + " ");


        //3) 매개변수도 있고 리턴타입도 있을 때
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };
        function = (Integer integer) -> {return integer * 10;};
        function = (integer) -> {return integer * 10;};
        function = integer -> {return integer * 10;};
        function = integer -> integer * 10;


        //4) 매개변수도 있고 리턴타입도 있는데 리턴타입이 boolean일 때
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        predicate = i -> i%2==0;



        //응용
        List<Integer> list = new ArrayList<>();
        makeRandomList(supplier, list);
        System.out.println(list);
        printEvent(predicate,consumer, list);
        List<Integer> newList = doSomething(function, list);
        System.out.println(newList);
    }

    private static <T> List<T> doSomething(Function<T, T> function, List<T> list) {
        List<T> tempList = new ArrayList<>(list.size());
        for (T item : list) {
            tempList.add(function.apply(item));
        }
        System.out.println();
        return tempList;
    }

    private static <T> void printEvent(Predicate<T> predicate, Consumer<T> consumer, List<T> list) {
        for (T i : list) {
            if (predicate.test(i)) {
                consumer.accept(i);
            }
        }
    }

    private static <T> void makeRandomList(Supplier<T> supplier, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(supplier.get());
        }
    }
}
