package employee;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee() {
        this.firstName="plony";
        this.lastName="almony";
        this.id = 0;
    }

    public Employee(String firstName, String lastName, int id) {
        if (id < 0)
            throw new NumberFormatException("Id Cannot be a negative number!");
        if(id % 1000000000 == 0)
            throw new NumberFormatException("Id must be a 9 digit number!");

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        if (id < 0)
            throw new NumberFormatException("Id Cannot be a negative number!");
        if(id / 1000000000 != 0 || id / 100000000 == 0)
            throw new NumberFormatException("Id must be a 9 digit number!");
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "employee.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public abstract float earnings();
}