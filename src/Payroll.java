import employee.BasePlusCommissionEmployee;
import employee.CommissionEmployee;
import employee.Employee;
import employee.HourlyEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Payroll {
    public static void main(String[] args) {
        Employee[] myArray = new Employee[]{new HourlyEmployee("Tehila", "Cohen", 123456789, 10, 90),
                new CommissionEmployee("David", "Levi", 987654321, (float) 750, 15),
                new BasePlusCommissionEmployee("Simon", "Cohen", 123456780, 800, 15, 60)};
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        for (int i = 0; i < 3; i++) {
            //if(myArray[i] instanceof BasePlusCommissionEmployee)
            float salary = myArray[i].earnings();
            if(i == 2)
                salary += (float) 0.1 * salary;
            System.out.println(myArray[i] + " Salary = " + salary);
        }



       /* HourlyEmployee myEemployee=new HourlyEmployee();
        myEemployee.setId(123456789);
        System.out.println(myEemployee);

        Employee m = new Employee() {
            @Override
            public float earnings() {
                return 100;
            }
        };


        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
    }
}