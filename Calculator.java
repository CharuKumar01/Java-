public class Calculator {
    void sum(){
        int a = 10;
        int b= 10;
        int s = a + b;
        System.out.println("sum = " + s);
    }
    void Subtraction(){
        int a = 10;
        int b= 10;
        int s = a - b;
        System.out.println("Subtraction = " +s);
    }
    void Multiplication(int a, int b){
        int s = a * b;
        System.out.println("Multiplication = " + s);
    }
    void devide(int a , int b){
        int s = a / b;
        System.out.println("devide = " + s);
    }
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.sum();
        calculator1.Multiplication(2, 5);
        // // Calculator(13, 5);
        // System.out.println(Calculator(14, 5));
    }
}
