import java.util.Objects;

public class HourlyEmployee extends Employee{
    private int hours;
    private float wage;

    public HourlyEmployee() {
        super();
        hours = 0;
        wage = 0;
    }

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        if (hours < 0)
            throw new NumberFormatException("Hours Cannot be a negative number!");
        if (wage < 0)
            throw new NumberFormatException("Wage Cannot be a negative number!");
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0)
            throw new NumberFormatException("Hours Cannot be a negative number!");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage < 0)
            throw new NumberFormatException("Wage Cannot be a negative number!");
        this.wage = wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee that)) return false;
        if (!super.equals(o)) return false;
        return hours == that.hours && Float.compare(wage, that.wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{"+
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public float earnings() {
        return hours*wage;
    }
}