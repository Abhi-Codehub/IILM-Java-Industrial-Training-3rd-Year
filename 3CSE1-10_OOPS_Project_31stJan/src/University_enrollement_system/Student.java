package University_enrollement_system;

public class Student extends Person{
    private static int idCounter = 1000;
    private String studentId;

    private double cgpa;
    public Student(String name, String email, double cgpa ) {
        super(name, email);
        this.cgpa = cgpa;
        this.studentId = "S" + (++idCounter); // auto increment
    }
    public String getStudentId() {
        return studentId;
    }
    @Override
    public void displayRole() {
        System.out.println("Role: Undergraduate Student | ID: " + studentId);
    }
    @Override
    public String toString() {
        return "Student[Name = " + getName() + ", ID = " + studentId + "]";
    }
}
