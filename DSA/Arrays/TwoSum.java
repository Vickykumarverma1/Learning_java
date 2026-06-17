package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 17;


        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            int sum = arr[low]+arr[high];
            if(sum == target)
            {
                System.out.println(low+1 + " " + (high+1));
                break;
            }
            else if(sum<target)
            {
                low++;
            }
            else
            {
                high--;
            }
        }


    }
}