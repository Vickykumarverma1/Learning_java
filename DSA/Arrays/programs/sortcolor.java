package Arrays.programs;

import java.util.Arrays;

public class sortcolor {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,0,0,2,0,1,0,1,2,0,2,2,2,0,0,1,1};
        int low = 0 ,mid = 0;
        int high = arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
     static void swap(int[] arr, int start,int end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
