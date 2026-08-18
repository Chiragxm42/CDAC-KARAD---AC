package ASSIGNMENTS;
import java.util.Scanner;

public class Q5_CharacterClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int other = 0;

        // Check each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                other++;
            }
        }

        System.out.println("Uppercase letters = " + uppercase);
        System.out.println("Lowercase letters = " + lowercase);
        System.out.println("Digits = " + digits);
        System.out.println("Other characters = " + other);

        sc.close();
    }
}
/*
==================================================
Q5. Character Classification
==================================================

Question:
Accept a string from the user and count/display the
number of:
- Uppercase letters
- Lowercase letters
- Digits
- Other characters

How to Run:
javac Q5_CharacterClassification.java
java Q5_CharacterClassification

Input:
Enter a string: Hello123!

Output:
Uppercase letters = 1
Lowercase letters = 4
Digits = 3
Other characters = 1

Explanation:
The program checks each character of the given
string and classifies it as uppercase, lowercase,
digit, or other character.

==================================================
 */