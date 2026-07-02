import java.util.Scanner;
import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
//        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19;
//        int ans = linearSearch(nums, target);
//        System.out.println(ans);
//    }
//    // search in the array: return the index if item found
//    // otherwise if item not found return -1
//    static int linearSearch(int[] arr, int target) {
//        if(arr.length == 0) {
//            return -1;
//        }
//        // run for loop
//        for(int index = 0; index < arr.length; index++) {
//            // check for element at every index if it = targer
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//
//        }
//        // this line will execute if none of the return statements executes
//        // hence the target not found
//        return -1;
//    }

        // Search the target and return the element:

//        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19;
//        int ans = linearSearch(nums, target);
//        System.out.println(ans);
//    }
//
//    // search in the array: return the index if item found
//    // otherwise if item not found return -1
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        // run for loop
//        for (int index = 0; index < arr.length; index++) {
//            // check for element at every index if it = targer
//            int element = arr[index];
//            if (element == target) {
//                return element;
//            }
//
//        }
//        // this line will execute if none of the return statements executes
//        // hence the target not found
//        return -1;
//    }

        // Ques 1: Searching in String:

//        String name = "Kunal";
//        char target = 'u';
//        System.out.println(search(name, target));
//    }
//    static boolean search(String str, char target) {
//        if(str.length() == 0) {
//            return false;
//        }
//        for(int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;

        // Ques 2: Searching in Range:

//        int[] arr = {18, 12, -7, 3, 14, 28};
//        int target = 3;
//        System.out.println(linearSearch(arr, target, 1, 4));
//    }
//
//    static int linearSearch(int[] arr, int target, int start, int end) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        // run for loop
//        for (int index = start; index <= end; index++) {
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//        }
//        return -1;
//    }

        // Ques 3: Minimum number in the array:

//        int[] arr = {18, 12, -7, 3, 14, 28};
//        System.out.println(min(arr));
//    }
//
//    // assume arr.length = 0
//    // return the minimum value in the array
//    static int min(int[] arr) {
//        int ans = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < ans) {
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }

        // Ques 4: Searching in 2D Array:

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it = targer
            int element = arr[index];
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the return statements executes
        // hence the target not found
        return -1;
    }
}