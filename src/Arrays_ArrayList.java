import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Arrays_ArrayList {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};
//        System.out.println(rnos2.length);

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the heap memory
        System.out.println(ros[1]);
    }
}