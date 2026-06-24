import java.util.Scanner;

public class conditionals_and_loops {

        public static void main(String[] args) {

//      int salary = 25400;
//      if(salary>10000){
//          salary = salary + 2000;
//      } else{
//          salary = salary + 1000;
//      }
//      System.out.println(salary);

            // multiple if else statements:

//      int salary = 25400;
//      if(salary > 10000){
//          salary += 2000;
//      } else if(salary>20000){
//          salary += 3000;
//      } else{
//          salary += 1000;
//      }
//      System.out.println(salary);

            // Q: Print numbers from 1 to 5:

//      for(int num=1;num<=5;num+=1){
//          System.out.println(num);
//      }

            // Q: Print numbers from 1 to n;

//      Scanner input = new Scanner(System.in);
//      int n = input.nextInt();
//      for (int num = 1; num <= n; num++) {
//          System.out.println(num + " ");
//      }

            // while loops:

//      int num = 1;
//      while(num<=5){
//          System.out.println(num);
//          num+=1;
//      }

//      Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      int num = 1;
//      while(num<=n){
//          System.out.println("Hello World");
//          num+=1;
//      }

            // do while loop:

//      int n = 1;
//      do{
//          System.out.println("Hello World");
//      } while(n!=1);

//      int n = 1;
//      do{
//          System.out.println(n);
//          n++;
//      } while(n<=5);

            // Ques 1: Largest of three numbers:

//      Scanner in = new Scanner(System.in);
//      int a = in.nextInt();
//      int b = in.nextInt();
//      int c = in.nextInt();
//      int max = a;
//      if(b>max){
//          max = b;
//      }
//      if(c>max){
//          max = c;
//      }
//      System.out.println(max);

            // 2nd method:

//      Scanner in = new Scanner(System.in);
//      int a = in.nextInt();
//      int b = in.nextInt();
//      int c = in.nextInt();
//      int max = 0;
//      if(a>b){
//          max = a;
//      } else{
//          max = b;
//      }
//      if(c>max){
//          max = c;
//      }
//      System.out.println(max);

            // 3rd Method:

//      Scanner in = new Scanner(System.in);
//      int a = in.nextInt();
//      int b = in.nextInt();
//      int c = in.nextInt();
//      int max = Math.max(c,Math.max(a,b));
//      System.out.println(max);

            // Ques 2: Check string is uppercase or lowercase:

//      Scanner in = new Scanner(System.in);
//      char ch = in.next().trim().charAt(0); // converts input string to char
//      if(ch>='a' && ch<='z'){
//          System.out.println("Lowercase");
//      } else{
//          System.out.println("Uppercase");
//      }

            // Ques 3: Find the nth Fibonacci number:

//      Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      int a = 0;
//      int b = 1;
//      int count = 2; // to start with second iteration as first two numbers are given
//      while(count<=n){
//          int temp = b;
//          b = b + a;
//          a = temp; // we are not doing a=b and doing a=temp because temp stores the updated value of b
//          count++;
//      }
//      System.out.println(b);

            // Ques 4: To find the count of the repeating digits in a number:

//      int n = 45535;
//      int count = 0;
//      while(n>0){
//          int rem = n % 10;
//          if(rem == 5){
//              count++;
//          }
//          n = n / 10;
//      }
//      System.out.println(count);

            // Ques 5: Find the reverse of a number:

//      Scanner in = new Scanner(System.in);
//      int num = in.nextInt();
//      int ans = 0;
//      while(num>0){
//          int rem = num % 10;
//          num /= 10;
//          ans = ans * 10 + rem;
//      }
//      System.out.println(ans);

            // Ques 6: CALCULATOR PROGRAM:

            Scanner in = new Scanner(System.in);
            // Take input from user till user does not press X or x
            int ans = 0;
            while (true) {
                // take the operator as input
                System.out.println("Enter the operator: ");
                char op = in.next().trim().charAt(0);
                System.out.println(); // new line
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    // input two numbers
                    System.out.println("Enter two numbers:");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    System.out.println();
                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
                System.out.println(ans);
            }

        }

}