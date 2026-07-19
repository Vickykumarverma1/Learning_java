package OOPs;
class std{
    String name;
    std(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println(name);
    }
}
public class constructorconcept {
    public static void main(String[] args) {
        std vicky = new std("Vicky");
        vicky.display();
    }
}
