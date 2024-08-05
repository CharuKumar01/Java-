package Day04;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        // System.out.println(isArmStrong(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem*rem*rem;
        }

        return sum == original;
    }
}
