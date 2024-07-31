package Day01;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println(num);

        // type casting 
        // int num = (int)(90.78f);
        // System.out.println(num);

        // automatic type promotions in expressions
        // int a = 257;
        // byte b = (byte)a;  // 257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        
        // System.out.println(d);
        // System.out.println(a * b);

        // byte b = 50;
        // b = b * 2;

        // int num = 'A';
        // System.out.println(num);

        // System.out.println(3 * 45.33434f);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // output is float + integer + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
