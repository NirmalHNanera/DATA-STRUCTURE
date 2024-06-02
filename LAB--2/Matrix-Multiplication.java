import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] secondMatrix = {{7, 8, 9}, {10, 11, 12}};
        
        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];
        
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        
        System.out.println("Resultant Matrix after multiplication:");

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}