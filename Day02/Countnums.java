package Day02;

public class Countnums {
    public static void main(String[] args) {
        int n = 444;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 4){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Total count of 4 is: " + count);
    }
}
