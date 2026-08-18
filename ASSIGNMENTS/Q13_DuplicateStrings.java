package ASSIGNMENTS;
public class Q13_DuplicateStrings {
    public static void main(String[] args) {

        String[] names = {
            "Rahul", "Amit", "Chirag", "Rahul",
            "Neha", "Amit", "Pooja", "Chirag"
        };

        System.out.println("Duplicate strings:");

        // Compare each string with the strings after it
        for (int i = 0; i < names.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (names[i].equals(names[j])) {
                    duplicate = true;
                    break;
                }
            }

            // Check if the string occurs again
            if (!duplicate) {

                for (int j = i + 1; j < names.length; j++) {

                    if (names[i].equals(names[j])) {
                        System.out.println(names[i]);
                        break;
                    }
                }
            }
        }
    }
}
/*
==================================================
Q13. Find Duplicate Strings
==================================================

Question:
Declare an array/list containing a few strings,
including some duplicate strings. Write a program
to identify and display the duplicate strings.

If a string occurs more than once, display that
string only once in the output.

How to Run:
javac Q13_DuplicateStrings.java
java Q13_DuplicateStrings

Input:
The program uses the following strings:
Rahul, Amit, Chirag, Rahul, Neha, Amit, Pooja, Chirag

Output:
Duplicate strings:
Rahul
Amit
Chirag

Explanation:
The program compares each string with the other
strings in the array. If the same string occurs
more than once, it is displayed only once.

==================================================
*/