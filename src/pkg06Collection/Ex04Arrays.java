package pkg06Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class Ex04Arrays {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[5];
        Arrays.fill(arr4, 9);
        System.out.println(Arrays.toString(arr4));

        Arrays.setAll(arr4, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return (int) (Math.random() * 5);
            }
        });
        //람다식  매개변수 -> 함수몸체  로 구성
        Arrays.setAll(arr4,i->(int)(Math.random()*5)); //단일실행문 중괄호 생략
        Arrays.setAll(arr4, i-> {return (int)(Math.random()*5); });
        System.out.println(Arrays.toString(arr4));
        System.out.println();

        Arrays.sort(arr4); //정렬
        System.out.println(Arrays.toString(arr4));
        int idx = Arrays.binarySearch(arr4, 1); //같은 원소의 index리턴
        System.out.println(idx);
        System.out.println();

        int[][] arr2Da = {{11, 12}, {21, 22}};
        int[][] arr2Db = {{11, 12}, {21, 22}};
        System.out.println(Arrays.toString(arr2Da));
        System.out.println(Arrays.equals(arr2Da,arr2Db));
        System.out.println(Arrays.deepToString(arr2Da));
        System.out.println(Arrays.deepEquals(arr2Da,arr2Db));
        System.out.println();

        //배열 => list 변환
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{0,1,2,3}));
        list.add(4);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(new Integer[]{0,1,2,3});
        list2.add(4); // 입력안됨 => 배열로 만들어져서 추가가 안됨.
        System.out.println(list2);
    }
}
