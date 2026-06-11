package Recursion;
//Factorial of a number
public class questionfour {
    public static void main(String[] args) {
//        let's take input as 5
//        so Output: 120
//        5! = 5×4×3×2×1
        System.out.println(facorial(5));

    }
    static int facorial(int n)
    {
        if(n == 1)
        {
            return n;
        }
        return n * facorial(n-1);
    }
}
