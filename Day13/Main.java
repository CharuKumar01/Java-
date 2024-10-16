package Day13;

public class Main {
    public static void main(String[] args) {
        // int ans = fibo(4);
        // System.out.println(ans);
        int[] arr = {1, 2, 3, 4};
        int target = 2;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }


    static int binarySearch(int[] arr, int target, int s, int e){
        int m = s + (e - s) / 2;
        if(s > e){
            return - 1;
        }
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return binarySearch(arr, target, s, m-1);
        }
        return binarySearch(arr, target, m+1, e);
    }
}
