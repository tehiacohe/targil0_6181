package employee;

import java.util.Objects;

public class CommissionEmployee extends Employee {
    private float grossSales;
    private  int commission;

    public CommissionEmployee() {
        super();
        grossSales = 0;
        commission = 0;
    }

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        if(grossSales < 0)
            throw new NumberFormatException("GrossSales Cannot be a negative number!");
        if(commission < 0)
            throw new NumberFormatException("Commission Cannot be a negative number!");
        this.grossSales = grossSales;
        this.commission = commission;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales < 0)
            throw new NumberFormatException("GrossSales Cannot be a negative number!");
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if(commission < 0)
            throw new NumberFormatException("Commission Cannot be a negative number!");
        this.commission = commission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(grossSales, that.grossSales) == 0 && commission == that.commission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commission);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }

    @Override
    public float earnings() {
        return (float) (commission * 0.01) * grossSales;
    }
}
