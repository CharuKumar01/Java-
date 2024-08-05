package Day04;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(1, 2, 3, 4, 5);
        multiple(2, 33, "hello", "world");
    }

    static void multiple(int a, int b, String ...v){
        
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
