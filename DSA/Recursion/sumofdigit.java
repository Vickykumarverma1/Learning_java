package Recursion;

public class sumofdigit {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        int temp = n%10;
        return temp + sum(n/10);

    }
}
