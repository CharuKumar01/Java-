import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = input.nextInt();
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        // int ans = linearSearch2(nums, target);
        // System.out.println(ans);
    }


    // search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statements above has been executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found 
    // otherwise if item not found return Integer.MAX_VALUE
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index until it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above has been executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
}
