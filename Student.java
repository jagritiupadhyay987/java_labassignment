import java.util.Scanner;

// Task 1: Student Class
public class Student {
    // Variables (data members)
    private int rollNumber;
    private String name;
    private String course;
    private double marks;
    private char grade;

    // Method: Input student details
    public void inputStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();

        // Calculate grade after marks are entered
        calculateGrade();
    }

    // Method: Calculate grade based on marks
    public void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }
    }

    // Method: Display student details
    public void displayStudent() {
        System.out.println("\n--- Student Record ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
