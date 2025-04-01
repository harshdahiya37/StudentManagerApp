public class Student {
    private String name;
    private int rollNo;
    private double grade;

    public Student(String name, int rollNo, double grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade;
    }
}

