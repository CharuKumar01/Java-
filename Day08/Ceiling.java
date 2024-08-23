package Day08;

/**
 * Ceiling
 */
public class Ceiling {

    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans = binarySearch(arr, 19);
        System.out.println(ans);
    }

    // return the index: smallest number greater than or equal to the target
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
           
            // but what if the target is greater than the greatest number in the array
            if (target > arr[arr.length -1 ]) {
                return -1;
            }
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else {
                // ans found
                return mid;
            }

        }
        return start;
    }
}