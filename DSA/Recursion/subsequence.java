import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        int [] arr = {1,3,2};

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        seq(index,arr,list);

    }
    static void seq(int index , int[] arr, ArrayList<Integer> list)
    {
        int n = arr.length;
        if(index == n)
        {
            System.out.println(list);
            return;
        }
//        not pick
        seq(index+1,arr,list);

//        pick
        list.add(arr[index]);
        seq(index+1,arr,list);
//        backtrack  
        list.removeLast();
    }
}
