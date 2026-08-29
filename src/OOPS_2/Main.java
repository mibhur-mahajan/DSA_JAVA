package OOPS_2;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human arpit = new Human(34, "arpit", 15000, true);
        System.out.println(kunal.name);
        System.out.println(kunal.population);
        System.out.println(rahul.population);
        System.out.println(arpit.population);

        greeting();
    }

    static void greeting() {
        System.out.println("Hello World");
    }

    Singleton obj = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    Singleton obj3 = Singleton.getInstance();

    // all 3 ref variables are pointing to just one object
}
