package Day10;

import java.util.Arrays;

public class MisMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        // search for the duplicate element and missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
