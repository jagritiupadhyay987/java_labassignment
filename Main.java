import java.util.Scanner;

// Task 3: Main Class
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StudentManagementSystem with capacity of 50 students
        StudentManagementSystem sms = new StudentManagementSystem(50);

        while (true) {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.inputStudent(sc); // Take input for student
                    sms.addStudent(s);  // Add to system
                    break;
                case 2:
                    sms.displayAllStudents(); // Show all student records
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
