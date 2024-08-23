package Day08;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));
        // int a = Math.max(0, 32);
        // System.out.println(a);
    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];

            //binary search 
            while(start < end){
                // try for the middle as potential ans
                int mid = start + (end - start) / 2;
                

                // calculate how many pieces you can divide this with this max sum 
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if(sum + num > mid){
                        // you can't add this in this subarray, make new one
                        // say you add this num in new subarray, then sum = num
                        sum = num;
                        pieces++; 
                    }else{
                        sum += num;
                    }
                } 
// {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32}
                if (pieces <= m) {
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        return end; // here start == end
    }
}
