import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch(empID) {
            case 1 -> System.out.println("kunal kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                switch(department){
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("no department found");
                }
            }
            default -> System.out.println("Enter correct employee ID");
        }
    }
}
