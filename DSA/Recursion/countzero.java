package Recursion;

public class countzero {
    public static void main(String[] args) {
        int n = 100100100;
//        output 6
        int c = 0;
        int ans = count(n,c);
        System.out.println(ans);
    }

    static int count(int n ,int c ) {
        if(n==0)
        {
            return c;
        }
        if(n%10 == 0)
        {
            c = c+1;
        }
        return count(n/10,c);

    }
}
