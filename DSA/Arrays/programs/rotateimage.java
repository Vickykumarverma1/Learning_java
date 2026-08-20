package Arrays.programs;

public class rotateimage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int n = matrix.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                swap(matrix,i,j);
            }
        }
        for(int i = 0; i<n; i++)
        {
            int start = 0;
            int end = n-1;
            while(start<=end)
            {
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void swap(int [][] matrix, int i, int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
