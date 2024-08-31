package Day10;

import java.util.Arrays;

// missing positive number in array
public class MPNIA {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        firstMissingPositive(arr);
        System.out.println(firstMissingPositive(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        // find the missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
    static void swap(int[] nums, int i, int c){
        int temp = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
    }
}
