package Day02;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0); 

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("letter is lower case");
        }else{
            System.out.println("UpperCase");
        }
        System.out.println(ch);
    }
}
