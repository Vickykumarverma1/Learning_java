package Recursion;

public class arraysort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};

        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // Current comparison is wrong
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Check the remaining array
        return isSorted(arr, index + 1);
    }
}