import java.util.ArrayList;

public class longestincreasingsubsequence {
        static int maxLen = 0;

        static void lis(int index,
        int[] arr,
        List<Integer> current)
        {
            if(index == arr.length)
            {
                maxLen =
                        Math.max(maxLen,
                                current.size());
                return;
            }

            // NOT PICK

            lis(index + 1,
                    arr,
                    current);

            // PICK

            if(current.isEmpty() ||
                    arr[index] >
                            current.get(current.size()-1))
            {
                current.add(arr[index]);

                lis(index + 1,
                        arr,
                        current);

                // BACKTRACK

                current.remove(current.size()-1);
            }
        }

        static void main(String[] args)
        {
            int[] arr =
                    {10,9,2,5,3,7,101,18};
            ArrayList<Integer> List = new ArrayList<>();

            lis(0,
                    arr,
                    ArrayList<Integer> List);

            System.out.println(maxLen);
    }
}
