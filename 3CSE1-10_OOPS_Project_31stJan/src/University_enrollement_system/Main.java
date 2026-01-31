package University_enrollement_system;

public class Main {
    public static void main (String[] args) {
        // 1. Create Professor
        Professor proAbhishek = new Professor("Abhishek", "abhishek@gmail.com", "ComputerScience"); // object creation

        // 2. Create Students
        Student s1 = new Student("Nikhil", "nikhil@iilm.edu", 9.1);
        Student s2 = new Student("Utkarsh", "Utkarsh@iilm.edu", 9.0);
        Student s3 = new Student("Sneha", "sneha@iilm.edu", 9.5);
        Student s4 = new Student("Isha", "isha@iilm.edu", 9.52);
        Student s5 = new Student("Aditya", "Aditya@iilm.edu", 8.5);

        // Print raw data of professors
        System.out.println("1. Individual data: ");
        System.out.println("Professor: " + proAbhishek.getName() + "[" + proAbhishek.getEmail() + "]");

        // Print raw data of students
        System.out.println("Student 1: " + s1.toString());
        System.out.println("Student 2: " + s2.toString());
        System.out.println("Student 3: " + s3.toString());
        System.out.println("Student 4: " + s4.toString());
        System.out.println("Student 5: " + s5.toString());
        System.out.println("=============================\n");

        // Create the course
        Course javaCourse = new Course("Java OOPS", "JV007", proAbhishek, 3);

        try {
            System.out.println(" Enrollment Process ");
            javaCourse.enrolledStudent(s1);
            javaCourse.enrolledStudent(s2);
            javaCourse.enrolledStudent(s3);
            javaCourse.enrolledStudent(s4);
            javaCourse.enrolledStudent(s5);
            // this will fail if the student is become more than capacity
            System.out.println("Attempting to enroll another student: ");

        } catch(EnrollmentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            javaCourse.displayDetails();
        }
    }
}
