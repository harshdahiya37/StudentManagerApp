import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Sort Students by Grade");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNo = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    manager.addStudent(new Student(name, rollNo, grade));
                    break;
                case 2:
                    System.out.println("\n--- All Students ---");
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll Number of Student to Update: ");
                    rollNo = scanner.nextInt();
                    System.out.print("Enter New Grade: ");
                    grade = scanner.nextDouble();
                    manager.updateGrade(rollNo, grade);
                    break;
                case 4:
                    System.out.print("Enter Roll Number of Student to Delete: ");
                    rollNo = scanner.nextInt();
                    manager.deleteStudent(rollNo);
                    break;
                case 5:
                    System.out.print("Enter Student Name to Search: ");
                    name = scanner.nextLine();
                    Student student = manager.searchStudentByName(name);
                    if (student != null) {
                        System.out.println("Student Found: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 6:
                    manager.sortStudentsByGrade();
                    System.out.println("\n--- Students Sorted by Grade ---");
                    manager.displayStudents();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

