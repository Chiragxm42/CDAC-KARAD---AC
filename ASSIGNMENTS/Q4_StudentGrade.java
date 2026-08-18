package ASSIGNMENTS;
import java.util.Scanner;

public class Q4_StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        // Enter marks for 5 subjects
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            total = total + marks;
        }

        // Calculate grade
        char grade;

        if (total >= 90) {
            grade = 'E';
        } else if (total >= 80) {
            grade = 'A';
        } else if (total >= 70) {
            grade = 'B';
        } else if (total >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks = " + total);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
/*
==================================================
Q4. Student Grade
==================================================

Question:
Write a program to calculate the grade of a student.
The student has five subjects, and each subject is
evaluated out of 20 marks.

Grade Rules:
90–100  → E
80–89   → A
70–79   → B
60–69   → C
Below 60 → F

How to Run:
javac Q4_StudentGrade.java
java Q4_StudentGrade

Input:
Enter marks for subject 1: 18
Enter marks for subject 2: 17
Enter marks for subject 3: 19
Enter marks for subject 4: 16
Enter marks for subject 5: 18

Output:
Total Marks = 88
Grade = A

Explanation:
The program accepts marks for five subjects and adds
them to calculate the total marks. It then uses
if-else conditions to assign the grade according
to the given rules.

==================================================
 */