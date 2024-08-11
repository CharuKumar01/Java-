package Day05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner input = new Scanner(System.in);

        // list.add(67);
        // list.add(67);
        // list.add(54);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);
        // list.add(67);

        // System.out.println(list.contains(45));

        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);

        //input 
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        //output 
        System.out.println(list);
    }
}
