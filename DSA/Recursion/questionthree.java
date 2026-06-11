package Recursion;
//Sum of first N natural numbers

public class questionthree {
    public static void main(String[] args) {
//        let n = 5
//        so its output must be 15
//        1+2+3+4+5 = 15
        int n = 5;
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n)
    {

        if(n==0)
        {
            return 0;
        }

        return   n + sum(n-1);
    }
}
