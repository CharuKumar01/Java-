package Day10;
// all duplicates in array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ADIA {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int c = nums[i] - 1; // c is the correct index
            if(nums[i] != nums[c]){
                swap(nums, i, c);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int i, int c){
        int temp = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
    }
}
