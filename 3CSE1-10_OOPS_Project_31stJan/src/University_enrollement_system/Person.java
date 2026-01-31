package University_enrollement_system;

public abstract class Person {
    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public abstract void displayRole();
}
