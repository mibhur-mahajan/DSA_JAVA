import java.util.Scanner;

public class switch_statements{

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        if (fruit.equals("mango")) {
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        }

//  == operator checks value as well as reference whereas .equals checks only the value.

//        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        // Another way of writing the above code:

//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//        }

        // Nested switch statements:

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1:
                System.out.println("Ram");
                break;
            case 2:
                System.out.println("Shyam");
                break;
            case 3:
                System.out.println("Aman");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Department not found");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}