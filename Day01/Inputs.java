package Day01;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);

        String name = input.nextLine();
        System.out.println(name);
        
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
