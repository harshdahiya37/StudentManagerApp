import java.util.*;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Delete student
    public void deleteStudent(int rollNo) {
        students.removeIf(student -> student.getRollNo() == rollNo);
    }

    // Update student grade
    public void updateGrade(int rollNo, double newGrade) {
        students.stream()
                .filter(student -> student.getRollNo() == rollNo)
                .forEach(student -> student.setGrade(newGrade));
    }

    // Search student by name
    public Student searchStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Display all students
    public void displayStudents() {
        students.forEach(System.out::println);
    }

    // Sort students by grade
    public void sortStudentsByGrade() {
        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());
    }
}

