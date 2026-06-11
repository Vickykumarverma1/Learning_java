package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

//Print numbers from 1 to N
public class questionone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    static void print(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
