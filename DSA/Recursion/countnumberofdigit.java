package Recursion;

public class countnumberofdigit {
    public static void main(String[] args) {
//        Count digits in a number
//        Input: 12345
//        Output: 5

        int n = 123456890;
        System.out.println(countdigit(n));
    }
    static int countdigit(int  n)
    {
        if(n<=0)
        {
            return 0;
        }
        return 1 +countdigit(n/10);
    }
}
