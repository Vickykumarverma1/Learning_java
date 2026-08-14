package Arrays.programs;

public class sub3 {
    public static void main(String[] args) {
        int []nums = {-1,1,1};
        int k =1 ;
        System.out.println(longSubarray(nums,k));
    }
    static int longSubarray(int[] nums, int k) {
        int maxlen = 0;
        int low = 0;
        int sum = 0;
        for(int high = 0; high<nums.length; high++ )
        {
            sum += nums[high];
            while(sum>=k)
            {
                if(sum==k)
                {
                    maxlen = Math.max(maxlen,high-low+1);
                }
                sum = sum - nums[low];
                low++;
            }
        }
        return maxlen;
    }


}


