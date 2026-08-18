package ASSIGNMENTS;
import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    int totalMarks;
}

public class Q8_StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNumber = sc.nextLine();

        System.out.print("Enter total marks: ");
        student.totalMarks = sc.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Student Name = " + student.name);
        System.out.println("Roll Number = " + student.rollNumber);
        System.out.println("Total Marks = " + student.totalMarks);

        sc.close();
    }
}
/*
==================================================
Q8. Student Details Using a Class
==================================================

Question:
Create a Student class containing:
- Student name
- Roll number
- Total marks

The roll number may contain both letters and
numbers. Accept the student details from the user
and display the data as entered.

How to Run:
javac Q8_StudentDetails.java
java Q8_StudentDetails

Input:
Enter student name: Chirag
Enter roll number: CSE101
Enter total marks: 450

Output:
Student Details:
Student Name = Chirag
Roll Number = CSE101
Total Marks = 450

Explanation:
The program creates a Student class with three
variables: name, roll number, and total marks.
A Student object is created to store the details
entered by the user.

The roll number is stored as a String because it
can contain both letters and numbers.

==================================================
*/