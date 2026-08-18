package ASSIGNMENTS;
/*Q1. Find the Maximum Number Accept n numbers through command-line arguments and find and display the maximum number.
 Note: Assume that at least one number is provided. */
public class Q1_MaximumNumber {
    public static void main(String[] args) {

        // Convert the first argument into an integer
        int max = Integer.parseInt(args[0]);

        // Check all remaining numbers
        for (int i = 1; i < args.length; i++) {

            int num = Integer.parseInt(args[i]);

            // If current number is greater than max
            if (num > max) {
                max = num;
            }
        }

        // Display maximum number
        System.out.println("Maximum number = " + max);
    }
}
/*
==================================================
Q1. Maximum Number
==================================================

Question:
Find the maximum number from the given numbers.

How to Run:
javac MaximumNumber.java
java MaximumNumber 10 25 7 50 15

Output:
Maximum number = 50

Explanation:
The program compares each number and stores the
largest number.

==================================================
*/ 