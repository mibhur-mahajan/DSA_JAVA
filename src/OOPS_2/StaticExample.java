package OOPS_2;

public class StaticExample {
    static int a = 4;
    static int b;

    // will only run once when the first obj is created
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);

        StaticExample.b += 3;

        System.out.println(StaticExample.a + " " + StaticExample.b);

        StaticExample obj2 = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);
    }
}
