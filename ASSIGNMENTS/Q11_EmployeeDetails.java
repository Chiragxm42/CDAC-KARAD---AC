package ASSIGNMENTS;

import java.util.Scanner;

class Employee {

    String firstName;
    String lastName;
    double monthlySalary;

    void initialize(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    void increaseSalary() {
        monthlySalary = monthlySalary + (monthlySalary * 10 / 100);
    }

    double yearlySalary() {
        return monthlySalary * 12;
    }
}

public class Q11_EmployeeDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Enter details of Employee 1:");

        System.out.print("First Name: ");
        String firstName1 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName1 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        emp1.initialize(firstName1, lastName1, salary1);

        System.out.println("\nEnter details of Employee 2:");

        System.out.print("First Name: ");
        String firstName2 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName2 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();

        emp2.initialize(firstName2, lastName2, salary2);

        System.out.println("\n--- Employee Details ---");

        System.out.println("\nEmployee 1:");
        emp1.displayDetails();

        System.out.println("\nEmployee 2:");
        emp2.displayDetails();

        System.out.println("\n--- Yearly Salary Before 10% Increase ---");

        System.out.println(emp1.firstName + " " + emp1.lastName
                + " = " + emp1.yearlySalary());

        System.out.println(emp2.firstName + " " + emp2.lastName
                + " = " + emp2.yearlySalary());

        emp1.increaseSalary();
        emp2.increaseSalary();

        System.out.println("\n--- Yearly Salary After 10% Increase ---");

        System.out.println(emp1.firstName + " " + emp1.lastName
                + " = " + emp1.yearlySalary());

        System.out.println(emp2.firstName + " " + emp2.lastName
                + " = " + emp2.yearlySalary());

        sc.close();
    }
}
/*
It might be easy yaar thoda hard tha mere liye but I did it😊
How to compile and run

Because you added:

package ASSIGNMENTS;

you should compile from:

D:\CDAC-KARAD---AC

Run:

javac ASSIGNMENTS\Q11_EmployeeDetails.java

Then:

java ASSIGNMENTS.Q11_EmployeeDetails

Notice the difference:

Compile:
javac ASSIGNMENTS\Q11_EmployeeDetails.java


Run:
java ASSIGNMENTS.Q11_EmployeeDetails
*/