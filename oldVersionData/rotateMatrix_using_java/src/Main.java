import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int [][] matrix1 = new int[num][num];
        createArray(input, matrix1);
        //printArray(matrix1);

        int [][] matrix2 = new int[num][num];
        rotateArray(matrix1, matrix2);
        printArray(matrix2);
        input.close();
    }

     static void createArray(Scanner scan, int[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    static void printArray(int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void rotateArray(int[][] matrix1, int[][] matrix2){
        for(int i = 0; i < matrix1.length; i ++){
            for (int j = 0; j < matrix1.length; j++) {
                matrix2[i][j] = matrix1[j][matrix1.length-1-i];
            }
        }
    }


}
