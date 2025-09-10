// Task 2: StudentManagementSystem Class
public class StudentManagementSystem {
    // Array to store multiple Student objects
    private Student[] students;
    
    // Counter to keep track of how many students are added
    private int count;

    // Constructor: initializes the array with given size
    public StudentManagementSystem(int size) {
        students = new Student[size];
        count = 0;
    }

    // Method: Add a new student record
    public void addStudent(Student s) {
        if (count < students.length) {   // Check if space is available
            students[count] = s;         // Add student object to array
            count++;                     // Increase student count
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Array is full!");
        }
    }

    // Method: Display all student records
    public void displayAllStudents() {
        if (count == 0) {   // No students added yet
            System.out.println("No student records available!");
        } else {
            // Loop through stored students and display details
            for (int i = 0; i < count; i++) {
                students[i].displayStudent();
            }
        }
    }
}
