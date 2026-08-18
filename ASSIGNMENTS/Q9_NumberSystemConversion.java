package ASSIGNMENTS;
import java.util.Scanner;

public class Q9_NumberSystemConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        sc.close();
    }
}
/*
==================================================
Q9. Number System Conversion
==================================================

Question:
Accept an integer number from the user and display
its:
- Binary equivalent
- Octal equivalent
- Hexadecimal equivalent

How to Run:
javac Q9_NumberSystemConversion.java
java Q9_NumberSystemConversion

Input:
Enter Number: 20

Output:
Given Number: 20
Binary equivalent: 10100
Octal equivalent: 24
Hexadecimal equivalent: 14

Explanation:
The program accepts an integer from the user and
converts it into binary, octal, and hexadecimal
using Java's built-in conversion methods.

Binary: Integer.toBinaryString()
Octal: Integer.toOctalString()
Hexadecimal: Integer.toHexString()

==================================================
*/