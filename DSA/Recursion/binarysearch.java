package Recursion;

public class binarysearch {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        int s = 0;
        int e = nums.length-1;
        System.out.println(bs(nums,target,s,e));

    }
    static int bs (int[] nums , int target , int s , int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid = s+(e-s)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]<target)
        {
            return bs(nums,target,mid+1,e);
        }
        else
            return bs(nums,target,s,mid-1);
    }
}
