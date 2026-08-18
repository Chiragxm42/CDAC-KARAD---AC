package ASSIGNMENTS;
import java.util.Scanner;

public class Q14_StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Compare original and reversed string
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}

/* ==================================================
Q14. String Palindrome
==================================================

Question:
Write a program to check whether a given string is
a palindrome. A palindrome reads the same forward
and backward.

How to Run:
javac Q14_StringPalindrome.java
java Q14_StringPalindrome

Input 1:
Enter a string: MADAM

Output:
Palindrome

Input 2:
Enter a string: HELLO

Output:
Not a Palindrome

Explanation:
The program reverses the given string and compares
it with the original string. If both strings are the
same, the given string is a palindrome. Otherwise,
it is not a palindrome.

==================================================
*/