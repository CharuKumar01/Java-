package Day14;

public class OddEven {
    public static void main(String[] args) {
        int n = 64; 
        System.out.println(Oe(n) ? "Odd number" : "Even Number");
    }

    static boolean Oe(int n){
        return (n & 1) == 1; // if we add any number with 1 in and operator(&) it will throw the same number, where false means even and true means odd
    }
}
