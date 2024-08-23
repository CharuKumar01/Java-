package Day07;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -6, -4, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int ans = binarySearch(arr, -12);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the int range in java

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
        return -1;
    }
}
