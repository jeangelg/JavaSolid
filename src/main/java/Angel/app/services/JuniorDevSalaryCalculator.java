package Angel.app.services;

import Angel.app.models.DeveloperReport;

public class  JuniorDevSalaryCalculator extends BaseSalaryCalculator {
    public JuniorDevSalaryCalculator(DeveloperReport developerReport) {
        super(developerReport);
    }

    @Override
    public double calculateSalary() {
        return developerReport.getHourlyRate() * developerReport.getWorkingHours();
    }
}
