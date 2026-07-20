package Arrays.programs;

public class sortedd {
    public static void main(String[] args) {
        int[]  arr = {1,8,3,4,5};
        boolean res =check(arr,0);
        System.out.println(res);
    }
    static boolean check(int[] arr , int i)
    {
        if(i == arr.length-1)
        {
            return true;

        }
        return (arr[i]<=arr[i+1] && check(arr, i+1));
    }
}
