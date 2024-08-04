import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String fruit = input.next();

        // if (fruit.equals("mango")) {
        // System.out.println("King of fruit");
        // }
        // if (fruit.equals("apple")) {
        // System.out.println("A sweet red fruit");
        // }

        // switch (fruit) { 
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple": 
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.err.println("Please enter a valid variable");
        // }

        // switch (fruit){
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("Round fruit");
        //     case "Grapes" -> System.out.println("Small fruit");
        //     default -> System.err.println("Please enter a valid variable");
        // }

        int day = input.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Enter a valid day");
        // }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid day");
        }


    }
}