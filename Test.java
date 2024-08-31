import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        String[] nums = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check in words: ");
        int num = input.nextInt();
        int reverse = 0;
        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        // System.out.println(reverse);
        num = reverse;
        reverse = 0;
        String words = "";
        // System.out.println(num);
        while(num > 0){
            int rem = num % 10;
            // System.out.println(rem);
            num /= 10;
            for(int i = 0; i < nums.length; i++){
                if(i == rem){
                    words = words + nums[i] + " ";
                } 
            }
        }
        System.out.println(words);
    }
}

