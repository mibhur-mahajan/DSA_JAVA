package OOPS_1;

public class OOPS_1 {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        // Wrapper Classes:
        int a = 10;
        Integer num = 45;
        System.out.println(num.intValue());

        // create a class
        class Student {
            int rno;
            String name;
            float marks;

            void greeting() {
                System.out.println("My name is " + this.name);
            }

            void changeName(String newName) {
                name = newName;
            }

            Student (Student other) {
                this.name = other.name;
                this.rno = other.rno;
                this.marks = other.marks;
            }

            // constructor
            // we need a way to add the values of the above properties object by object
            Student() {
                this.rno = 13;
                this.name = "Kunal";
                this.marks = 88.5f;
            }

            Student(int rno, String name, float marks) {
                rno = rno;
                name = name;
                marks = marks;
            }
        }

//        Student[] students = new Student[5];
//        Student kunal;
//        System.out.println(Arrays.toString(students));

        Student kunal = new Student(13, "Kunal Kushwaha", 88.5f);
        Student rahul = new Student();
        System.out.println(kunal);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);

//        kunal.rno = 24;
//        kunal.name = "Kunal";
//        kunal.marks = 90;
//
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

//        kunal.changeName("Shoe Lover");
//        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);

        // final keyword:
        final int bonus = 2; // now bonus = 3; will give an error because we can't modify it

        class A {
            final int num = 10;
            String name;

            public A(String name) {
                this.name = name;
            }

        }

        final A Karan = new A("Kunal Kushwaha");
        Karan.name = "other name";
    }
}