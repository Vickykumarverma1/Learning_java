package Arrays.programs;

public class subarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,5,6,6,7,7,1,0,0,1,1};
        int target = 2;
        int max = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j = i; j<arr.length; j++)
            {
                sum+=arr[j];
                if(sum == target)
                {
                    max = Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);

    }
}
