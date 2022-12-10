import java.util.Random;
import java.util.Scanner;
public class zulotest {

    public static void main(String[] args) {
        // Read the number of rows and columns from the user
        int rows = readRowsFromUser();
        int cols = readColsFromUser();

        // Create a random matrix with the specified dimensions
        int[][] matrix = createRandomMatrix(rows, cols);

        // Print the matrix to the screen
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transposed = transposeMatrix(matrix);

        // Print the transposed matrix to the screen
        printMatrix(transposed);
    }

    // Prompts the user to enter the number of rows for the matrix
    // and returns the number entered by the user
    public static int readRowsFromUser() {
        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows for the matrix: ");

        // Read the number entered by the user
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // Return the number of rows
        return rows;
    }

    // Prompts the user to enter the number of columns for the matrix
    // and returns the number entered by the user
    public static int readColsFromUser() {
        // Prompt the user to enter the number of columns
        System.out.print("Enter the number of columns for the matrix: ");

        // Read the number entered by the user
        Scanner scanner = new Scanner(System.in);
        int cols = scanner.nextInt();

        // Return the number of columns
        return cols;
    }
    // Creates a random matrix with the specified number of rows and columns
    // and returns a reference to the matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        // Create a new matrix with the specified dimensions
        int[][] matrix = new int[rows][cols];

        // Create a random number generator
        Random random = new Random();

        // Populate the matrix with random numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        // Return the matrix
        return matrix;
    }

    // Transposes the matrix and returns a reference to the transposed matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix with transposed dimensions
        int[][] transposed = new int[cols][rows];

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Return the transposed matrix
        return transposed;
    }

    // Prints the matrix to the screen
    public static void printMatrix (int[][] matrix) {
        // Get the dimensions of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Print the matrix to the screen
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}