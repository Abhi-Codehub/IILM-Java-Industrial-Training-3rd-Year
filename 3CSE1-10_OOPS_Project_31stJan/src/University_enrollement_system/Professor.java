package University_enrollement_system;

public class Professor extends Person {
    public String department;
    public Professor(String name, String email,String department) {
        super(name, email);
        this.department = department;
    }
    @Override
    public void displayRole() {
        System.out.println("Role : Professor | Dept: " + department);
    }
}
