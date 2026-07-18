package OOPs;
class abc1 {
    int x = 10;
    int y = 5;
    int z = 0;
    abc1(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    abc1()
    {
       System.out.println(x+y);
    }
}
public class typesofconstructor {
    public static void main(String[] args) {
        abc1 a = new abc1(12,12,12);

        abc1 b = new abc1(10,10,5);
        System.out.println(b.x+b.y+b.z);
        System.out.println(a.x+a.y+a.z);
        abc1 c = new abc1();


    }
}
// O/P
//25
//36
//15