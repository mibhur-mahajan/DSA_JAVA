import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Binary_Search {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = 22;
//        int ans = binarySearch(arr, target);
//        System.out.println(ans);
//    }
//    // return the index
//    // return -1 if it does not exist
//    static int binarySearch(int[] arr, int target) {
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
//        return -1;
//    }

        // Order Agnostic Binary Search:

                int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
                int target = 22;
                int ans = orderAgnosticBS(arr, target);
                System.out.println(ans);
            }
            static int orderAgnosticBS(int[] arr, int target) {
                int start = 0;
                int end = arr.length - 1;
                // Find whether the array is sorted in ascending or descending
                boolean isAsc = arr[start] < arr[end];
                while (start <= end) {
                    // Find the middle element
                    int mid = start + (end - start) / 2;
                    if (arr[mid] == target) {
                        return mid;
                    }
                    if (isAsc) {
                        if (target < arr[mid]) {
                            end = mid - 1;
                        } else {
                            start = mid + 1;
                        }
                    } else {
                        if (target > arr[mid]) {
                            end = mid - 1;
                        } else {
                            start = mid + 1;
                        }
                    }
                }
                return -1;
            }
        }