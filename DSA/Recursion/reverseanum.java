package Recursion;



public class reverseanum {
    static int rev = 0;
    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverse(n));
    }
    static int reverse(int n)
    {
        if(n==0)
        {
            return 0;
        }

        rev = (rev*10 + n%10);
        reverse(n/10);
        return rev ;

    }


}
