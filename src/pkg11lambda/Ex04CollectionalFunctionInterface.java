package pkg11lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex04CollectionalFunctionInterface {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final int temp = i; //지역변수가 익명객체 안으로 들어가려면 상수로 변환 해줘야한다.
            list.add(new Supplier<Integer>() {
                @Override
                public Integer get() {
                    return temp;
                }
            }.get());

        }

        for (int i = 0; i < 10; i++){
            final int temp = i; //지역변수가 익명객체 안으로 들어가려면 상수로 변환 해줘야한다.
            list.add(new Supplier<Integer>() {
                @Override
                public Integer get() {
                    return temp;
                }
            }.get());

        }
        //forEach는 원소가 있을 때 접근하기 위해 사용
//		list.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + ",");
//			}
//		});

        list.forEach(i -> System.out.print(i));
        System.out.println();

        list.removeIf(i -> i % 2 == 0);

        //UnaryOperator는 Function의 변형, 매개변수와 리터의 타입이 동일
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t * 10;
            }
        });
        list.replaceAll(i -> i * 10);

        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String t, String u) {
                System.out.printf("{%s, %s}", t, u);
            }
        });
        map.forEach((t, u) -> System.out.printf("{%s, %s}", t, u));
        System.out.println();
    }
}
