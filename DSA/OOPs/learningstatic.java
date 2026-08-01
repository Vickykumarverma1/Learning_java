package OOPs;
class human {
    int age;
    String name;
    int salary;
    static long  population = 70000000;   //static means for all it should be same anyone can use it

    public human(int age, String name, int salary)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
        human.population +=1;
    }
    @Override
    public String toString()
    {
        return "human{" +
                "name='" + name + '\'' +
                ", age=" + age +
               ", salary=" + salary +
                ", population=" + population +
                '}';
    }

}
public class learningstatic {
    public static void main(String[] args) {
        human vicky = new human(22 ,"Vicky",200000);
        human rahul = new human(23,"Rahul",200000);
        System.out.println(vicky);
        System.out.println(rahul);
    }
}
