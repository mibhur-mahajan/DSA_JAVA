import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search_Interview_Question {
    public static void main(String[] args) {

//        // Ceiling of a Number:
//        // return index of smallest no. greater than equal to target
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 15;
//        int ans = ceiling(arr, target);
//        System.out.println(ans);
//    }
//    // return the index
//    // return -1 if it does not exist
//    static int ceiling(int[] arr, int target) {
//        // but what if the target is greater than the greatest number in the array
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end) {
//            // find the middle element
//            // int mid = (start + end) / 2; // might be possible that that (start + end) exceeds the range of integer in java
//            int mid = start + (end - start) / 2;
//            if(target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return start;
//    }

        // Floor of a Number:

//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int target = 15;
//        int ans = floor(arr, target);
//        System.out.println(ans);
//    }
//    // return the index
//    static int floor(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end) {
//            // find the middle element
//            // int mid = (start + end) / 2; // might be possible that that (start + end) exceeds the range of integer in java
//            int mid = start + (end - start) / 2;
//            if(target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return end;
//    }

    // Leetcode 744 :
    // Leetcode 34 :

    // Ques: Find position of an element in a sorted array of infinite numbers:


        static int findingRange(int[] arr, int target) {
            // first find the range
            // first start with a box of size 2
            int start = 0;
            int end = 1;
            // condition for the target to lie in the range
            
        }
        static int infinite_position(int[] arr, int target, int start, int end)  {
            while(start <= end) {
                int mid = start + (end - start)/2;
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if(target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // ans found
                    return mid;
                }
            }
            return -1;
        }

        }

}