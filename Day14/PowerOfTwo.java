package Day14;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 132;
        boolean ans = (n & (n - 1)) == 0 ;
        System.out.println(ans);
    }
}
