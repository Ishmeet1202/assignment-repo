package javamodule.IntroToJava1.Question4;

// QUESTION 4

public class MatrixRowColumnSum {

    private static void sumOfElementsRowWise(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sumRowWise = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRowWise += matrix[i][j];
            }
            System.out.print("Sum of elements in row "+(i + 1)+" is: "+sumRowWise+"\n");
        }
    }

    private static void sumOfElementsColumnWise(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int sumColumnWise = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumColumnWise += matrix[j][i];
            }
            System.out.print("Sum of elements in column "+(i + 1)+" is: "+sumColumnWise+"\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10}};
        sumOfElementsRowWise(matrix);
        System.out.println();
        sumOfElementsColumnWise(matrix);
    }
}
