package employee;

import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        if(baseSalary < 0)
            throw new NumberFormatException("BaseSalary Cannot be a negative number!");
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0)
            throw new NumberFormatException("BaseSalary Cannot be a negative number!");
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(baseSalary, that.baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + getGrossSales() +
                ", commission=" + getCommission() +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public float earnings() {
        return baseSalary + super.earnings();
    }
}
