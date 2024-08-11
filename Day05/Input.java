package Day05;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;

        // System.out.println(arr[1]);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = input.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");;
        // }

        // for(int num : arr){
        //     System.out.println(num);
        // }
        
        // System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
