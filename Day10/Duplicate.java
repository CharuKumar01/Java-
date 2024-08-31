package Day10;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != i + 1) {
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int c) {
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}
