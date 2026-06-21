package Recursion;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,45,67,98};
        int target = 1;
        System.out.println(check(arr,0,target));
    }
    static boolean check(int[] arr, int i, int target)
    {
        if (i==arr.length)
        {
            return false;
        }
        return (arr[i] == target) || check(arr,i+1,target);
    }
}
