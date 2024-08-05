package Day04;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(marks);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
