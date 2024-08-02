package Day02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 0;
        int c = 1;
        int count = 2;

        while (count <= n) {
           int temp = c;
           c = c + p;
           p = temp;
           count++;
        }
        System.out.println(c);
        
    }
}
