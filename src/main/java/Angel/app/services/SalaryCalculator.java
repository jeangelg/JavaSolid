package Angel.app.services;

import Angel.app.models.DeveloperReport;

import java.util.List;

public class SalaryCalculator {
    private final List<BaseSalaryCalculator> developerCalculation;

    public SalaryCalculator(List<BaseSalaryCalculator> developerCalculation) {
        this.developerCalculation = developerCalculation;
    }


    public double calculateTotalSalaries() {
        double totalSalaries = 0.0;
        for (BaseSalaryCalculator devCalc  : this.developerCalculation) {
            totalSalaries += devCalc.calculateSalary();
        }
        return totalSalaries;
    }

}
