package developer_vassiljev;
import java.util.Currency;

/**
 * Simple JavaBean domain object that represents a Developer
  */

public class Developer {
    private String firstName;
    private String lastName;
    private String specialty;
    private int salary;
    public Developer() {
    }
    public Developer(String firstName, String lastName, String specialty, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.salary = salary;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nSpecialty:" + specialty +
                "\nSalary: $" + salary / 100 + "." + salary % 100;
    }
}
