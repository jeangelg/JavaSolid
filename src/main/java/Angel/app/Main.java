package Angel.app;

import Angel.app.models.DeveloperReport;
import Angel.app.services.BaseSalaryCalculator;
import Angel.app.services.JuniorDevSalaryCalculator;
import Angel.app.services.SalaryCalculator;
import Angel.app.services.SeniorDevSalaryCalculator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<BaseSalaryCalculator> devCalculations = new ArrayList<BaseSalaryCalculator>();

        devCalculations.add(new SeniorDevSalaryCalculator(
                new DeveloperReport(1, "Dev1","Senior Developer",160, 30.5)
        ));

        devCalculations.add(new JuniorDevSalaryCalculator(
                new DeveloperReport(2, "Dev2","Junior Developer",150, 20)
        ));

        devCalculations.add(new JuniorDevSalaryCalculator(
                new DeveloperReport(3, "Dev3","Senior Developer",180, 30.5)
        ));

        SalaryCalculator calculator = new SalaryCalculator(devCalculations);
        System.out.printf("Sum of all the developer salaries is: %.2f %n", calculator.calculateTotalSalaries());

    }
}