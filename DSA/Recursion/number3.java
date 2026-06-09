package Recursion;

public class number3 {
    static int n = 1;
        public static void main(String [] args)
        {
//            print 5,4,3,2,1
            print(n);

        }
        static void print(int n)
        {
            if (n==6)
            {
                return;
            }
            print(n+1);
            System.out.println(n);
        }


}