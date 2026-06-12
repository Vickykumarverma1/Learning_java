package Recursion;



public class reverseanum {

    public static void main(String[] args) {
        int n=12345;
        int rev = 0;
        System.out.println(reverse(n,rev));
    }
    static int reverse(int n,int rev)
    {
        if(n==0)
        {
            return 0;
        }

        rev = (rev*10 + n%10);
        reverse(n/10,rev);
        return rev ;

    }


}
