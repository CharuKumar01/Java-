package Day04;

// import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Q: take input of two numbers and print the sum
        // int ans = sum2();
        // System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // return the value
    // static int sum2() {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter number 1: ");
    //     int num1 = input.nextInt();
    //     System.out.println("Enter number 2: ");
    //     int num2 = input.nextInt();
    //     int sum = num1 + num2;
    //     return sum;
    // }

    // static void sum() {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter number 1: ");
    //     int num1 = input.nextInt();
    //     System.out.println("Enter number 2: ");
    //     int num2 = input.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println("The sum = " + sum);
    // }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
