import java.util.Scanner;


void main() {
//        System.out.println("HELLO WORLD");
//        System.out.print("hello world");
//        System.out.println("Hello World");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
//        System.out.println(input.nextLine());
//        System.out.println(input.next());

          // Primitive Data types:
//        int roll_no = 64;
//        char letter = 'r';
//        float marks = 98.67f;
//        double largeDecimalNumbers = 34455453.2344;
//        long largeInteger = 34355242343324L;
//        boolean check = false;

//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your roll number: ");
//        int roll_no = input.nextInt();
//        System.out.println("Your roll number is " + roll_no);

//          int a = 234_000_000; // it is 2crore 34lakh underscore_ will get ignored
//          System.out.println(a);

//          Scanner input = new Scanner(System.in);
//          String name = input.next();
//          System.out.println(name);
//          float marks = input.nextFloat();
//          System.out.println(marks);

        // SUM OF TWO NUMBERS:
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum = " + sum);

        // TYPE CASTING AND TYPE CONVERSION:

//        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257%256 = 1, maximum a byte can store is 256
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b) / c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number); //print ASCII values

//          byte b = 42;
//          char c = 'a';
//          short s = 1024;
//          int i = 50000;
//          float f = 5.67f;
//          double d = 0.1234;
//          double result = (f * b) + (i / c) - (d - s);
//          // float + int - double = double
//          System.out.println((f * b) + " " + (i / c) + " " + (d - s));
//          System.out.println(result);


          // WHILE LOOP

//          int count = 1;
//          while(count != 5){
//                  System.out.println(count);
//                  count++;
//          }

          // FOR LOOP

//        for(int count = 1; count!= 5; count++){
//                System.out.println(count);
//        }

        // CONVERT CELSIUS TO FAHRENHEIT:

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
}



