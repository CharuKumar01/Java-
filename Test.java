public class Test {
    public static void main(String[] args) {
        int p = product(234);
        System.out.println(p);
    }
    static int product(int n){
        int p = 1;
        while (n > 0) {
            int rem = n % 10;
            p *= rem;
            n /= 10;
        }
        return n;
    }
}
