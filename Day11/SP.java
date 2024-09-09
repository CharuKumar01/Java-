package Day11;

import java.util.Scanner;

// String Palindrome
public class SP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String to check if it is Palindrome or not: ");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
