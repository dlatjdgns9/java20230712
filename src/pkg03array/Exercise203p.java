package pkg03array;

public class Exercise203p {
    public static void main(String[] args) {
        Math m = new Math();
        int[] arr = {9, 5, 24, 13, 3, 21};

        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
    }
}

class Person {
    private String name;
    private String gender;
    private int age;
    private int height;
    private int weight;
}

class Math{
    int max(int[] arr) {
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

}
