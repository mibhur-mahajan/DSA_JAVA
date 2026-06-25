import java.util.Scanner;
import java.util.Arrays;

public class functions_methods {

//    public static void main(String[] args) {
//        sum();
//    }
//
//    static void sum() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter number 2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is: " + sum);
//    }

//    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
//    }
//
//    // return the value:
//    static int sum2() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter number 2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum; //return means function over. anything below or outside this will never execute.
//    }
//
//      public static void main(String[] args) {
//          int ans = sum3(20, 30);
//          System.out.println(ans);
//      }
//
//      // pass the value of numbers when you are calling the method in main()
//      static int sum3(int a, int b) {
//          int sum = a + b;
//          return sum;
//      }

//        public static void main(String[] args) {
//            String message = greet();
//            System.out.println(message);
//        }
//
//        static String greet() {
//            String greeting = "how are you";
//            return greeting;
//        }

//          public static void main(String[] args) {
//              String personalised = myGreet("Kunal Kushwaha");
//              System.out.println(personalised);
//          }
//
//          static String myGreet(String name) {
//              String message = "Hello " + name;
//              return message;
//          }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String naam = in.next();
//        String personalised = myGreet(naam);
//        System.out.println(personalised);
//    }
//
//    static String myGreet(String name) {
//        String message = "Hello " + name;
//        return message;
//    }

//      public static void main(String[] args) {
//          // create an array
//          int[] arr = {1, 3, 2, 45, 6};
//          change(arr);
//          System.out.println(Arrays.toString(arr));
//      }
//
//      static void change(int[] nums) {
//          nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
//      }

        // Concept of Shadowing:

//        static int x = 90; // this will be shadowed
//        public static void main(String[] args) {
//            System.out.println(x); // 90
//            int x = 40;
//            System.out.println(x); // 40
//            fun();
//        }
//
//        static void fun() {
//            System.out.println(x);
//        }

          // Variable length arguments(VarArgs):

//          public static void main(String[] args) {
//              fun(2,3,4,5,56,87,23,45,65);
//          }
//
//          static void fun(int ...v) {
//              System.out.println(Arrays.toString(v));
//          }

            public static void main(String[] args) {
                multiple(2, 3, "Kunal", "Rahul", "Aman" );
            }

            static void multiple(int a, int b, String ...v) {
                System.out.println(Arrays.toString(v));
            }

}
