import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Binary_Search_2D_Arrays {
    public static void main(String[] args) {
//        int[][] arr = {
//                {10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50}
//        };
//        System.out.println(Arrays.toString(search(arr, 37)));
//    }
//    static int[] search(int[][] matrix, int target) {
//        int r = 0;
//        int c = matrix.length - 1;
//        while (r < matrix.length && c >= 0) {
//            if (matrix[r][c] == target) {
//                return new int[]{r, c};
//            }
//            if (matrix[r][c] < target) {
//                r++;
//            }
//            else{
//                c--;
//            }
//        }
//        return new int[]{-1, -1};
//    }

                // Sorted Array:

                int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
                // Searching for 89 (should return [-1, -1])
                System.out.println(Arrays.toString(search(arr, 9)));
            }

            // 1. Fixed return type to int[] and first parameter to int[][]
            static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
                while (cStart <= cEnd) {
                    int mid = cStart + (cEnd - cStart) / 2;
                    if (matrix[row][mid] == target) {
                        return new int[]{row, mid};
                    }
                    if (matrix[row][mid] < target) {
                        cStart = mid + 1;
                    } else {
                        cEnd = mid - 1;
                    }
                }
                return new int[]{-1, -1};
            }

            static int[] search(int[][] matrix, int target) {
                int rows = matrix.length;
                if (rows == 0) return new int[]{-1, -1};
                int cols = matrix[0].length;

                if (rows == 1) {
                    return binarySearch(matrix, 0, 0, cols - 1, target);
                }

                int rStart = 0;
                int rEnd = rows - 1;
                int cMid = cols / 2;

                // Loop until 2 rows are remaining
                while (rStart < (rEnd - 1)) {
                    int mid = rStart + (rEnd - rStart) / 2;
                    if (matrix[mid][cMid] == target) {
                        return new int[]{mid, cMid};
                    }
                    if (matrix[mid][cMid] < target) {
                        rStart = mid;
                    } else {
                        rEnd = mid;
                    }
                }

                // Check the middle column elements of the remaining two rows
                if (matrix[rStart][cMid] == target) {
                    return new int[]{rStart, cMid};
                }
                if (matrix[rStart + 1][cMid] == target) {
                    return new int[]{rStart + 1, cMid};
                }

                // Search in 1st half
                if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
                    return binarySearch(matrix, rStart, 0, cMid - 1, target);
                }
                // Search in 2nd half
                if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
                    return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
                }
                // Search in 3rd half
                if (cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
                    return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
                }
                // Search in 4th half
                if (cMid + 1 < cols && target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][cols - 1]) {
                    return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
                }

                return new int[]{-1, -1};
            }
        }
