package pkg03array;

public class Ex02ArrayShuffleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        print(arr);
        shuffle(arr);
        bubbleSort(arr);
        shuffle(arr);
        selectionSort(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.printf("%d", arr[i]);
        }
        System.out.println("");
    }

    static void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int rand = (int)(java.lang.Math.random()*10);
            int tmp = a[i];
            a[i] = a[rand];
            a[rand] = tmp;
        }
        print(a);
    }

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            boolean change = false;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j + 1] < a[j]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    change = true;
                }
            }
            if (!change) {
                System.out.println(i);
                break;
            }
        }
        print(a);
    }


    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int selectIdx = i;
            for (int j = 0 + i; j < a.length ; j++) {
                if (a[selectIdx] >= a[j]) {
                    selectIdx=j;
                }
            }
            int tmp = a[selectIdx];
            a[selectIdx] = a[i];
            a[i] = tmp;

        }
        print(a);
    }

}
