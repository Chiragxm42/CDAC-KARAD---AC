package ASSIGNMENTS;
import java.util.Scanner;

public class Q3_Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
/* 
==================================================
Q3. Fibonacci Series
==================================================

Question:
Write a program to print the Fibonacci series up to a given number of terms.

How to Run:
javac Q3_Fibonacci.java
java Q3_Fibonacci

Input:
Enter number of terms: 7

Output:
Fibonacci Series: 0 1 1 2 3 5 8

Explanation:
The program generates the Fibonacci series by adding the previous two numbers.

==================================================
*/