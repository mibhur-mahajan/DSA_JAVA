import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern_Printing {

    // Pattern - 1:

    //    public static void main(String[] args) {
//        pattern1(4);
//    }
//    static void pattern1(int n) {
//        for(int row = 1; row <= n; row++){
//            // for every row run the col
//            for(int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            // when one row is printed, we need to add a newline
//            System.out.println();
//        }
//    }

    // Pattern - 2:

//    public static void main(String[] args) {
//        pattern2(5);
//    }
//    static void pattern2(int n){
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    // Pattern - 3:

//    public static void main(String[] args) {
//        pattern3(4);
//    }
//    static void pattern3(int n){
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }
//    }

    // Pattern - 4:

//    public static void main(String[] args) {
//        pattern2(5);
//    }
//    static void pattern2(int n){
//        for(int row = 1; row <= 2 * n; row++){
//            int totalColsInRow = row > n ? 2 * n - row - 1 : row;
//            for(int col = 1; col <= totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    // Pattern - 5:

//    public static void main(String[] args) {
//        pattern5(5);
//    }
//    static void pattern5(int n){
//        for(int row = 1; row <= 2 * n; row++){
//            int totalColsInRow = row > n ? 2 * n - row - 1 : row;
//            int noOfSpaces = n - totalColsInRow;
//            for(int s = 0; s < noOfSpaces; s++){
//                System.out.print(" ");
//            }
//            for(int col = 1; col <= totalColsInRow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    // Pattern - 6:

    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 0; s < n - row; s++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for(int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

    // Pattern - 7:

//    public static void main(String[] args) {
//        pattern7(5);
//    }
//    static void pattern7(int n){
//        for(int row = 1; row <= 2 * n; row++){
//            int c = row > n ? 2 * n - row: row;
//            for(int s = 0; s < n - c; s++){
//                System.out.print(" ");
//            }
//            for(int col = c; col >= 1; col--) {
//                System.out.print(col);
//            }
//            for(int col = 2; col <= c; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//
//        }
//    }

    // Pattern - 8:

//    public static void main(String[] args) {
//        pattern8(4);
//    }
//    static void pattern8(int n){
//        int originalN = n;
//        n = 2 * n;
//        for(int row = 0; row <= n; row++){
//            for(int col = 0; col <= n; col++){
//                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
//                System.out.print(atEveryIndex + " ");
//            }
//            System.out.println();
//        }
//    }

}