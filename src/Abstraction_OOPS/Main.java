package Abstraction_OOPS;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();

        Parent.hello();
//        Parent mom = new Parent(45); // this will give error because you cannot create an object of the abstract class.
    }
}
