package org.example.lesson06;

public class Matrix {
    public static void main(String[] args) {

        int[][] mat1 = {{1,2,3},{4,5,6},{9,0,6}};
        int[][] mat2 = {{9,0,6},{3,1,0},{8,2,3}};

        System.out.println("Elements of first matrix");
        printMatrix(mat1);

        System.out.println("Elements of second matrix");
        printMatrix(mat2);

        System.out.println("Sum of two matrix");
        int[][] sum = sumMatrix(mat1, mat2);
        printMatrix(sum);



        //Why for loop does not work without public static void main(String[] args)?
//        int[][] mat = new int[2][5];
//        for (int[] ints : mat) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(mat[0][2]);
//        System.out.println(mat[1][3]);

    }

    private static int[][] sumMatrix(int[][] mat1, int[][] mat2) {
        int[][] sum = new int [3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] mat2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat2[i][j] + " " + "\t");
            }
            System.out.println();
        }
    }

}
