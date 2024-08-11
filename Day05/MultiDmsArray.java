package Day05;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDmsArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        Scanner input = new Scanner(System.in);
         int[][] arr = new int[3][2];

        int[][] arr2 = {
            {1, 2, 3}, // 0th index
            {4, 5, 6}, // 1st index
            {5, 7, 8, 9} // 2nd index
        };

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        //output
        // for (int row = 0; row < arr.length; row++) {
        //     // for each column in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.err.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
