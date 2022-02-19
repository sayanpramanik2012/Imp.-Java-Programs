//Code By TGSAYAN
import java.util.Scanner;
public class AddMatrices {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        //int rows = 2, columns = 3;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++){
                firstMatrix[i][j]=s.nextInt();
            }
            
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++){
                secondMatrix[i][j]=s.nextInt();
            }
            
        }
        //int[][] firstMatrix = { {2, 3}, {5, 2} };
        //int[][] secondMatrix = { {-4, 5}, {5, 6} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        //System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}