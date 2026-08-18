package ASSIGNMENTS;
import java.util.Arrays;
import java.util.Scanner;

public class Q10_SortStudentNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (maximum 10): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        // Accept student names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("\nStudent names in alphabetical order:");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
/*
==================================================
Q10. Sort Student Names
==================================================

Question:
Read at most 10 student names and store them in an
appropriate array/list. Sort the names in
alphabetical order and display the sorted names.
Use appropriate library function for sorting.

How to Run:
javac Q10_SortStudentNames.java
java Q10_SortStudentNames

Input:
Enter number of students (maximum 10): 5
Enter name of student 1: Rahul
Enter name of student 2: Amit
Enter name of student 3: Chirag
Enter name of student 4: Neha
Enter name of student 5: Pooja

Output:
Student names in alphabetical order:
Amit
CHIRAG  <----------Its ME😊
Neha
Pooja
Rahul

Explanation:
The program stores student names in a String array
and uses the library function Arrays.sort() to sort
the names in alphabetical order.

==================================================
*/