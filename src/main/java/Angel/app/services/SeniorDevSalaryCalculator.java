package Angel.app.services;

import Angel.app.models.DeveloperReport;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class SeniorDevSalaryCalculator extends BaseSalaryCalculator {

    public SeniorDevSalaryCalculator(DeveloperReport developerReport) {
        super(developerReport);
    }

    @Override
    public double calculateSalary() {
          return developerReport.getHourlyRate() * developerReport.getWorkingHours() * 1.2;
    }
}
