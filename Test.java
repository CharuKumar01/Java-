import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 3};
        System.out.println(containsDuplicate(nums));
        
    }

    static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length - i; j++){
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return false;
    }
}
