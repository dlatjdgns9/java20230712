package pkg03array;

public class Ex05TwoDimensional {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2d(arr);
        System.out.println();
        int[][] arr2 = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr[i][j];
                arr2[i][arr2[i].length - 1] += arr[i][j];
                arr2[arr2[i].length-1][j] += arr[i][j];

                arr2[arr2.length - 1][arr2.length - 1] += arr[i][j];
            }
        }
        print2d(arr2);
    }


    static void print2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { //2차원 배열에서 length는 행의 길이를 뜻한다. arr.length는 3이다.
            for (int j = 0; j < arr[i].length; j++) {
                if(j!=0) System.out.print(",");
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
