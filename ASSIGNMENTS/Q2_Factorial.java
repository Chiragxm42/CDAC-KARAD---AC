package ASSIGNMENTS;
import java.util.Scanner;

public class Q2_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}

/* 
==================================================
Q2. Factorial of a Number
==================================================

Question:
Write a program to calculate the factorial of a
given non-negative integer.

How to Run:
javac Q2_Factorial.java
java Q2_Factorial

Input:
Enter a number: 5

Output:
Factorial = 120

Explanation:
The program multiplies all numbers from 1 to the
given number.

For example:
5! = 1 × 2 × 3 × 4 × 5
   = 120

==================================================
*/