
/*
4.    Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object.
 The Matrix class has the following information:
a.    number of rows of matrix
b.    number of columns of matrix
c.    elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a.    get the number of rows
b.    get the number of columns
c.    set the elements of the matrix at given position (i,j)
d.    adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
*/
package assignment_4;
import java.util.Scanner;
public class Matrix {
	private int rows;
    private int columns;
    private int[][] elements;

    
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new int[rows][columns]; 
    }

    
    public int getRows() {
        return rows;
    }

 
    public int getColumns() {
        return columns;
    }

    
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid index for matrix element.");
        }
    }

   
    public Matrix add(Matrix other) {
        
        if (this.rows != other.getRows() || this.columns != other.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        
        Matrix result = new Matrix(rows, columns);

      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.elements[i][j] + other.elements[i][j]);
            }
        }

        return result;
    }

    
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int cols1 = scanner.nextInt();

        
        Matrix matrix1 = new Matrix(rows1, cols1);
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix1.setElement(i, j, scanner.nextInt());
            }
        }

        
        System.out.print("Enter the number of rows for Matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        
        Matrix matrix2 = new Matrix(rows2, cols2);
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix2.setElement(i, j, scanner.nextInt());
            }
        }

        
        System.out.println("\nResult of matrix addition:");
        Matrix result = matrix1.add(matrix2);

        
        if (result != null) {
            result.display();
        }

       
    }

}
