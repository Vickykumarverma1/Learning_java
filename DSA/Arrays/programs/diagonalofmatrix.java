package Arrays.programs;

public class diagonalofmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int row = matrix.length;
        int column = matrix[0].length;
//        brute force
//        for(int i = 0; i<row; i++)
//        {
//            for(int j = 0; j<column; j++)
//            {
//                if(i==j)
//                {
//                    System.out.println(matrix[i][j]);
//                }
//            }
//        }
//        optimized one
        for(int i = 0; i < row; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

//        reverse of the diagonal
        for (int i = row-1; i >=0; i--) {
            System.out.print(matrix[i][i]+ " ");
        }

    }
}
