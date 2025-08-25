package Week3;
class Student {
    private int studentId;
    private String name;
    private double grade;
    private String course;

    // Default constructor
    public Student() {
        this.studentId = 0;
        this.name = "Unknown";
        this.grade = 0.0;
        this.course = "None";
    }

    // Parameterized constructor
    public Student(int studentId, String name, double grade, String course) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    // Getters & Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    // Method
    public char calculateLetterGrade() {
        if (grade >= 90) return 'A';
        else if (grade >= 75) return 'B';
        else if (grade >= 60) return 'C';
        else return 'D';
    }

    public void displayStudent() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Course: " + course + ", Grade: " + grade + " (" + calculateLetterGrade() + ")");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Alice", 88, "Computer Science");

        s1.displayStudent();
        s2.displayStudent();

        s1.setStudentId(102);
        s1.setName("Bob");
        s1.setCourse("Math");
        s1.setGrade(95);
        s1.displayStudent();
    }
}
