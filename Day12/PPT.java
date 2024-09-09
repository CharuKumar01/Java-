package Day12;

import java.util.Scanner;

//pre-paid taxi 
/*
for 5 km 50rs
for next 10km 10rs/km
for next 10km 8rs/km
more than 25 5rs/km
 */
public class PPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter travell distance: ");
        int km = input.nextInt();
        int rs = 0;
        if(km <= 5){
            System.out.println("You have to pay Rs-50");
        }else{
            for(int i = 1; i <= km; i++){  
                if(i <= 15){
                    rs += 10;
                }else if(i <= 25){
                    rs += 8;
                }else{
                    rs += 5;
                }
            }
            System.out.printf("Total amount is: %d", rs);
        }
    }
}
