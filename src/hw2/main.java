package hw2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
        //2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
        //3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        printArr(Task4(5));

    }
        //4
        public static int [][] Task4 (int n) {
            int [][] arr4 = new int[n][n];
            for (int i = 0; i<n; i++) {
                arr4[i][i] = 1;
                arr4[i][n-1-i] = 1;
            }
            return arr4;
        }
        public static void printArr(int[][] arr4) {
            for (int i=0; i<arr4.length; i++) {
                for (int j=0; j<arr4.length; j++) {
                    System.out.print(arr4[i][j] + " ");
                }
                System.out.println();
            }
        }


}
