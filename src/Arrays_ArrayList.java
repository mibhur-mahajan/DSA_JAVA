import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Arrays_ArrayList {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // array of primitives:
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};
//        System.out.println(rnos2.length);

//        int[] ros; // declaration of array. ros is getting defined in the stack
//        ros = new int[5]; // initialisation: actually here object is being created in the heap memory
//        System.out.println(ros[1]); // Prints 0
//    }

//        String[] arr = new String[4];
//        System.out.println(arr[0]); // Prints null

//        int [] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 233;
//        arr[3] = 543;
//        arr[4] = 3;
//        // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);

        // input using for loops:

//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Enhanced for loop:

//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int num : arr) { // for every element in array, print the element
//            System.out.println(num + " "); // her num represents element of array
//        }

        // Best way of printing array:

//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        // array of objects:

//        Scanner in = new Scanner(System.in);
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));

        // Passing in Functions:

//        int[] nums = {3, 4, 5, 12};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//
//    }
//    static void change(int[] arr) {
//        arr[0] = 99;
//    }

        // Multidimensional/2-D Arrays:

//        int[][] arr = new int[3][];
//
//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
//        };

//          int[][] arr = new int[3][2];
////          System.out.println(arr.length); // no of rows
//        // input:
//        Scanner in = new Scanner(System.in);
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }
//        // output:
////        for (int row = 0; row < arr.length; row++) {
////            // for each col in every row
////            for (int col = 0; col < arr[row].length; col++) {
////                System.out.println(arr[row][col] + " ");
////            }
////        }
//
//        // better way of output using enhanced for loop:
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Column not fixed:

//        int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6},
//                {7, 8, 9}
//        };
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // ArrayList:

        // Syntax
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(78);
//        list.add(234);
//        list.add(345);
//        list.add(43);
//        System.out.println(list.contains(234));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        // Taking input in an ArrayList:

//        ArrayList<Integer> list = new ArrayList<>(5);
//        Scanner in = new Scanner(System.in);
//        for(int i = 0; i < 10; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list);

        // get item at any index:

//        ArrayList<Integer> list = new ArrayList<>(5);
//        Scanner in = new Scanner(System.in);
//        for(int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        for(int i = 0; i < 5; i++) {
//            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
//        }
//        System.out.println(list);

        // Multidimensional ArrayList:
//        Scanner in = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        // initialisation
//        for(int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        // add elements
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                list.get(i).add(in.nextInt());
//            }
//        }
//        System.out.println(list);

        // Ques 1: Swapping values in an array:

//        int[] arr = {1, 3, 23, 9, 18};
//        swap(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

        // Ques 2: Maximum value of an array:

//        int[] arr = {1, 3, 23, 9, 18};
//        System.out.println(max(arr));
//    }
//
//    // imagine that arr is not empty
//    static int max(int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

        // Ques 3: Maximum value of an array within a range:

//        int[] arr = {1, 3, 23, 9, 18};
//        System.out.println(maxRange(arr, 1, 3));
//    }
//    static int maxRange(int[] arr, int start, int end) {
//        int maxVal = arr[start];
//        for(int i = start; i<=end; i++) {
//            if(arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

        // Ques 4: Reversing an Array:

        int[] arr = {1, 3, 23, 9, 18};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}