package OOPs;
class Student1 {

   String name = null;
   int roll = 0;
   int age = 0;

    Student1(String name, int roll, int age)
    {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
//    @Override
//    public String toString() {
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", roll=" + roll +
//                ", age=" + age +
//                '}';
//    }
        void display() {
            System.out.println("Name : " + name);
            System.out.println("Roll : " + roll);
            System.out.println("Age  : " + age);
        }
}


public class thisasreference {
    public static void main(String[] args) {
        Student1 vicky = new Student1("vicky" , 12 ,21);
        Student1 rahul = new Student1("rahul",15,21);
        vicky.display();

    }
}
