package OOPs;

public class learningstatic2 {
    public static void main(String[] args) {
        learningstatic2 obj = new learningstatic2();
        obj.fun();
    }
    void fun()
    {
        System.out.println("non static function");
        fun2();
    }

    static void fun2()
    {
        System.out.println("static function");

    }
}
