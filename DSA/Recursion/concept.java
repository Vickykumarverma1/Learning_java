package Recursion;

public class concept {
    public static void main(String[] args) {
//        n-- and --n are whole different here
//        if you yes n-- then first it pass the value of n then subtract it so it end up passing the same value of n
//        but at the same time if you use --n then it will first subtract the value then pass it.
        int n = 5;
        print(n);
    }
//    static void print(int n)
//    {
//        if(n == 0)
//        {
//            return;
//        }
//        System.out.println(n);
//        print(n--);
//       this will give the error as "StackOverflow"
//    }
    static void print(int n)
    {
        if(n == 0)
        {
            return ;
        }
        System.out.println(n);
        print(--n);
//        this will work fine and print the number in decreasing order

    }
}
