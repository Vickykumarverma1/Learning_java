package Arrays.programs;

public class sellstocks {
    public static void main(String[] args) {
        int[]nums = {7,1,5,4,6,4};
        System.out.println(maxProfit(nums));
    }
     static int maxProfit(int[] nums) {
        int maxprofit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++)
        {
            min = Math.min(min,nums[i]);
            int profit = nums[i]-min;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}


