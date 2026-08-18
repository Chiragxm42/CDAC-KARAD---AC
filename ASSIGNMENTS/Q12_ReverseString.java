package ASSIGNMENTS;

import java.util.Scanner;

public class Q12_ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string: " + reverse);

        sc.close();
    }
}
/*
==================================================
Q12. Reverse a String
==================================================

Question:
Write a program to reverse a given string without
using a built-in string-reversal function such as
strrev() or slicing syntax.

How to Run:
javac Q12_ReverseString.java
java ASSIGNMENTS.Q12_ReverseString

Input:
Enter a string: SUNBEAM

Output:
Reversed string: MAEBNUS

Explanation:
The program starts from the last character of the
string and moves toward the first character using
a for loop. Each character is added to a new string
to create the reversed string.

==================================================
*/