package Day07;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-11, -6, -4, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orgerAgnosticBS(arr2, target);
        System.out.println(ans);
    }

    static int orgerAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the int range in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
