package Recursion;

import java.util.ArrayList;

public class findeindexofsortedarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,9,9};
        int target = 9;
        check(arr,0,target);
        System.out.println(res);
    }
    static ArrayList<Integer> res = new ArrayList<>();
    static void check(int[] arr , int i, int target)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==target)
        {
            res.add(i);
        }
        check(arr,i+1,target);
    }
}
