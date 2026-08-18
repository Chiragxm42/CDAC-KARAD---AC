package ASSIGNMENTS;
import java.util.Scanner;

public class Q6_MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept dimensions of first matrix
        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        // Accept dimensions of second matrix
        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Check whether multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of first matrix must be equal to rows of second matrix.");
            sc.close();
            return;
        }

        // Create matrices
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Enter elements of first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Enter elements of second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] = result[i][j]
                            + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resulting Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
==================================================
Q6. Matrix Multiplication
==================================================

Question:
Write a program to perform multiplication of two
matrices. Accept the dimensions and elements of
both matrices from the user.

Condition:
The number of columns in the first matrix must be
equal to the number of rows in the second matrix.

How to Run:
javac Q6_MatrixMultiplication.java
java Q6_MatrixMultiplication

Input:
Enter rows of first matrix: 2
Enter columns of first matrix: 2
Enter rows of second matrix: 2
Enter columns of second matrix: 2

Enter elements of first matrix:
1 2
3 4

Enter elements of second matrix:
5 6
7 8

Output:
Resulting Matrix:
19 22
43 50

Explanation:
The program first checks whether matrix
multiplication is possible. The multiplication is
possible only when the columns of the first matrix
are equal to the rows of the second matrix.

The program then multiplies the rows of the first
matrix with the columns of the second matrix and
displays the resulting matrix.

================================================== 
*/