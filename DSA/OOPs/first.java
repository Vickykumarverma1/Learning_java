package OOPs;

class Student {

    String name;
    int rollNo;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

public class first {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Vicky";
        s1.rollNo = 101;
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.age);

        s1.study();
//        s1.eat();
    }
}