package Recursion;

public class fibonacciexample {
    public static void main(String[] args) {
         long ans =fibo(5);
        System.out.println(ans);
    }
    static long fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo( n-1) + fibo( n-2);
    }
}
