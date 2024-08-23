// rotated binary search with duplicate array nums
package Day08;

public class RBS_DA {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,0,1,2,2,2};
        System.out.println(rbs_da(arr, 5));
    }

    static int rbs_da(int[] arr, int target){
        int pivot = findPivot(arr);
        if(target == arr[pivot]){
            return pivot;
        }
        if (arr[pivot] == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot -1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end  = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if start, middle and end elements are same, then skip the element
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // check if the start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // if left side is sorted, check for the right side
            else if(arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start  <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return - 1;
    }
}
