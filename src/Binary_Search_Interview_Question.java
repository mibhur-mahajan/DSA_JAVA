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

//        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
//        int target = 10;
//        System.out.println(ans(arr, target));
//        }
//        static int ans(int[] arr, int target) {
//            // first find the range
//            // first start with a box of size 2
//            int start = 0;
//            int end = 1;
//            // condition for the target to lie in the range
//            while (target > arr[end]) {
//                int newStart = end + 1;
//                // double the box value
//                // end = previous end + sizeofbox * 2
//                end = end + (end - start +1) * 2;
//                start = newStart;
//            }
//            return infinite_position(arr, target, start, end);
//        }
//        static int infinite_position(int[] arr, int target, int start, int end)  {
//            while(start <= end) {
//                int mid = start + (end - start)/2;
//                if(target < arr[mid]) {
//                    end = mid - 1;
//                } else if(target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    // ans found
//                    return mid;
//                }
//            }
//            return -1;
//        }

        // Leetcode 852:
        // Leetcode 1095
        // Leetcode 33:


        // Ques: Search in rotated sorted array/ Rotated Binary Search:

//                int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//                System.out.println(findPivot(arr));
//            }
//
//            public static int search(int[] nums, int target) {
//                int pivot = findPivot(nums);
//
//                // Array is not rotated
//                if (pivot == -1) {
//                    return binarySearch(nums, target, 0, nums.length - 1);
//                }
//
//                // Target is the pivot
//                if (nums[pivot] == target) {
//                    return pivot;
//                }
//
//                // Search in the left half
//                if (target >= nums[0]) {
//                    return binarySearch(nums, target, 0, pivot - 1);
//                }
//
//                // Search in the right half
//                return binarySearch(nums, target, pivot + 1, nums.length - 1);
//            }
//
//            public static int binarySearch(int[] arr, int target, int start, int end) {
//                while (start <= end) {
//                    int mid = start + (end - start) / 2;
//
//                    if (target < arr[mid]) {
//                        end = mid - 1;
//                    } else if (target > arr[mid]) {
//                        start = mid + 1;
//                    } else {
//                        return mid;
//                    }
//                }
//
//                return -1;
//            }
//
//            public static int findPivot(int[] arr) {
//                int start = 0;
//                int end = arr.length - 1;
//
//                while (start <= end) {
//                    int mid = start + (end - start) / 2;
//
//                    // Case 1: Mid is the pivot
//                    if (mid < end && arr[mid] > arr[mid + 1]) {
//                        return mid;
//                    }
//
//                    // Case 2: Mid - 1 is the pivot
//                    if (mid > start && arr[mid] < arr[mid - 1]) {
//                        return mid - 1;
//                    }
//
//                    // Search in the left half
//                    if (arr[mid] <= arr[start]) {
//                        end = mid - 1;
//                    } else {
//                        // Search in the right half
//                        start = mid + 1;
//                    }
//                }
//
//                return -1;
//            }
//        }


        // Ques : Finding Pivot with duplicate values in array:

//        int[] arr = {2, 2, 2, 9, 2};
//        System.out.println(findPivotWithDuplicates(arr));
//    }
//
//    public static int search(int[] nums, int target) {
//        int pivot = findPivotWithDuplicates(nums);
//
//        // Array is not rotated
//        if (pivot == -1) {
//            return binarySearch(nums, target, 0, nums.length - 1);
//        }
//
//        // Target is the pivot
//        if (nums[pivot] == target) {
//            return pivot;
//        }
//
//        // Search in the left half
//        if (target >= nums[0]) {
//            return binarySearch(nums, target, 0, pivot - 1);
//        }
//
//        // Search in the right half
//        return binarySearch(nums, target, pivot + 1, nums.length - 1);
//    }
//
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//        return -1;
//    }
//
//    public static int findPivotWithDuplicates(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            // Case 1: Mid is the pivot
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//
//            // Case 2: Mid - 1 is the pivot
//            if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid - 1;
//            }
//
//            // if elements at middle, start, end are equal then just skip the duplicates
//            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                // skip the duplicates
//                // NOTE: what if these elements at start and end were the pivot?
//                // check if start is pivot
//                if (arr[start] > arr[start + 1]) {
//                    return start;
//                }
//                start++;
//                // check whether end is pivot
//                if (arr[end] < arr[end - 1]) {
//                    return end - 1;
//                }
//                end--;
//            }
//            // Search in the left half
//            if (arr[mid] <= arr[start]) {
//                end = mid - 1;
//            } else {
//                // Search in the right half
//                start = mid + 1;
//            }
//        }
//
//        return -1;
//    }

        // Ques:  Find the count of times the array is rotated:

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }