package ASSIGNMENTS;
import java.util.Scanner;

public class Q15_CountAlphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[26];

        // Check each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert lowercase letter to uppercase
            ch = Character.toUpperCase(ch);

            // Count only alphabets
            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }
        }

        // Display only alphabets that occur
        System.out.println("Alphabet occurrences:");

        for (int i = 0; i < 26; i++) {

            if (count[i] > 0) {
                char alphabet = (char) ('A' + i);
                System.out.println(alphabet + " : " + count[i]);
            }
        }

        sc.close();
    }
}
/*
==================================================
Q15. Count Occurrences of Alphabets
==================================================

Question:
Accept a string from the user and count the
occurrence of each alphabet without considering
the difference between uppercase and lowercase
letters.

Ignore spaces, digits, and special characters.

How to Run:
javac Q15_CountAlphabets.java
java Q15_CountAlphabets

Input:
Enter a string: Welcome to SunBeam.

Output:
Alphabet occurrences:
A : 1
B : 1
C : 1
E : 3
L : 1
M : 2
N : 1
O : 2
S : 1
T : 1
U : 1
W : 1

Explanation:
The program uses an integer array of size 26 to
store the count of each alphabet. Each character
is converted to uppercase, so uppercase and
lowercase letters are counted together.

Spaces, digits, and special characters are ignored.
Only alphabets that occur in the input are displayed.

==================================================
*/