public class swapnumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: "+ b);
    }
}
