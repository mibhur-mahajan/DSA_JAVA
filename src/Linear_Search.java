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

//        int[][] arr = {
//                {23, 4, 1},
//                {18, 12, 3, 9},
//                {78, 99, 34, 56},
//                {18, 12}
//        };
//        int target = 34;
//        int[] ans = search(arr, target); //format of return value{row,col}
//        System.out.println(Arrays.toString(ans));
//    }
//
//    static int[] search(int[][] arr, int target) {
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == target) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }

        // Ques 5: Maximum value in 2D array:

//        int[][] arr = {
//                {23, 4, 1},
//                {18, 12, 3, 9},
//                {78, 99, 34, 56},
//                {18, 12}
//        };
//        int ans = max(arr);
//        System.out.println((ans));
//        System.out.println(Integer.MIN_VALUE);
//    }
//
//    static int max(int[][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                int element = arr[row][col];
//                if (element > max) {
//                    max = element;
//                }
//            }
//        }
//        return max;
//    }

        // find count of no's that have even number of digits:

//        int[] nums = {12, 345, 2, 6, 7896};
//        System.out.println(findNumbers(nums));
//    }
//
//    static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // function to check whether a number contains even digit or not
//    static boolean even(int num) {
//        int numberOfDigits = digits(num);
//        return numberOfDigits % 2 == 0;
//    }
//
//    // count number of digits in a number
//    static int digits(int num) {
//        if (num < 0) {
//            num = num * -1;
//        }
//        if (num == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10; // num/=10
//        }
//        return count;
//    }

        // Second Method: Optimised Solution

//        int[] nums = {12, 345, 2, 6, 7896};
//        System.out.println(findNumbers(nums));
//    }
//
//    static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // function to check whether a number contains even digit or not
//    static boolean even(int num) {
//        int numberOfDigits = digits(num);
//        return numberOfDigits % 2 == 0;
//    }
//    static int digits(int num) {
//        if (num < 0) {
//            num = num * -1;
//        }
//        return (int)(Math.log10(num)) + 1;
//    }

        // Maximum Wealth:


    }
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


}