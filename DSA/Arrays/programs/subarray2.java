package Arrays.programs;

import java.util.HashMap;

public class subarray2 {
    public static void main(String[] args) {
        int [] arr = {1,0,0,4,5,5,5,5,6,6,7,7,7,8,8,8};
        HashMap<Integer,Integer> presum = new HashMap<>();
        int max = 0;
        int sum = 0;
        int target = 24;

        for(int i = 0; i< arr.length; i++)
        {
            sum+=arr[i];
            if(sum==target)
            {
                max = Math.max(max,i);
            }
            int rem = sum-target;
            if(presum.containsKey(rem))
            {
                int len = i-presum.get(rem);
                max = Math.max(max,len);
            }
            if(!presum.containsKey(sum))
            {
                presum.put(sum,i);
            }
        }
        System.out.println(max);
    }
}
