package ASSIGNMENTS;
import java.util.Scanner;

public class Q7_MultiplicationTables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter second number: ");
        int end = sc.nextInt();

        // Generate tables from start to end
        for (int num = start; num <= end; num++) {

            System.out.println("\nMultiplication Table of " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }

        sc.close();
    }
}
/*
==================================================
Q7. Multiplication Tables
==================================================

Question:
Accept two numbers from the user and display the
multiplication tables for all numbers from the first
number to the second number.

How to Run:
javac Q7_MultiplicationTables.java
java Q7_MultiplicationTables

Input:
Enter first number: 5
Enter second number: 7

Output:
Multiplication Table of 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Multiplication Table of 6
6 x 1 = 6
...
6 x 10 = 60

Multiplication Table of 7
7 x 1 = 7
...
7 x 10 = 70

Explanation:
The program uses two loops. The outer loop selects
each number from the first number to the second
number. The inner loop generates the multiplication
table from 1 to 10.

==================================================
*/