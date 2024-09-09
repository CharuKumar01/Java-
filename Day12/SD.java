package Day12;

// showroom discount
import java.util.Scanner;

public class SD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price for Mil Clothes: ");
        double price1 = input.nextInt();
        System.out.print("Enter price for Handloom Items: ");
        double price2 = input.nextInt();
        double discountM = 0.0;
        double discountH = 0.0;

        // switch (clothes) {
        // case "mil_cloth":
        // System.out.print("Enter price range: ");
        // int item = input.nextInt();
        // if(item >= 0 && item <= 100){
        // System.out.println("No discount for you!");
        // }else if(item >= 100 && item <= 200){
        // System.out.println("5% discount");
        // }else if(item >= 200 && item <= 300){
        // System.out.println("7.5% discount");
        // }else{
        // System.out.println("10% discount");
        // }
        // break;
        // case "Handloom_items":
        // System.out.print("Enter price range: ");
        // int i = input.nextInt();
        // if(i >= 0 && i <= 100){
        // System.out.println("5% discount");
        // }else if(i >= 100 && i <= 200){
        // System.out.println("7.5% discount");
        // }else if(i >= 200 && i <= 300){
        // System.out.println("10% discount");
        // }else{
        // System.out.println("15% discount");
        // }
        // break;
        // default:
        // System.out.println("Enter a valid cloth item");
        // break;
        // }
        // }

        if (price1 <= 200) {
            discountM = 5.0;
            // discountH = 7.5;
        } else if (price1 <= 300) {
            discountM = 7.5;
            // discountH = 10.0;
        } else {
            discountM = 10.0;
            // discountH = 15.0;
        }

        if (price2 <= 100) {
            discountH = 5.0;
        } else if (price2 <= 200) {
            // discountM = 5.0;
            discountH = 7.5;
        } else if (price2 <= 300) {
            // discountM = 7.5;
            discountH = 10.0;
        } else {
            // discountM = 10.0;
            discountH = 15.0;
        }

        double dM = price1 * (discountM / 100);
        double dH = price2 * (discountH / 100);
        double total = (price1 - dM) + (price2 - dH);
        System.out.printf("Discount for mil_clothes: %.2f and Discount for Handloom_items: %.2f", dM, dH);
        System.out.println();
        System.out.printf("Net amount for mil_clothes: %.2f and Net amount for Handloom_items: %.2f", price1 - dM,
                price2 - dH);
        System.out.println();
        System.out.printf("Total Price: %.2f", total);
    }
}