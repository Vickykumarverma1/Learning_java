package Recursion;

public class checksortedarray {
    public static void main(String[] args) {
// in this question I am going to solve a problem to chack a given array is sorted or not
//  by using recursion.

        int [] arr = {1,1,3,4,5,6};
        boolean res = check(arr,0);
        System.out.println(res);
    }
    static boolean check(int [] arr, int index)
    {
        if (index == arr.length-1)
        {
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return check(arr,index+1);
    }
}
