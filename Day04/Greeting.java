package Day04;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
      // greeting();  
      // System.out.println(greet());
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = input.next();
      String personalised = myGreet(name);
      System.out.println(personalised);
    }

    // static void greeting(){
    //     System.out.println("hello world");
    // }

    // static String greet(){
    //   String greeting = "how are you?";
    //   return greeting;
    // }

    static String myGreet(String name){
      String message = "Hello " + name;
      return message;
     }
}
