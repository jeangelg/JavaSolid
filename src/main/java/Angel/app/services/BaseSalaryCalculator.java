package Angel.app.services;

import Angel.app.models.DeveloperReport;
import lombok.*;


public abstract class BaseSalaryCalculator {

    @Getter(AccessLevel.PROTECTED)   // getter protected
    @Setter(AccessLevel.PRIVATE)     // setter privado
    protected DeveloperReport developerReport;

    public BaseSalaryCalculator(DeveloperReport developerReport)
    {
        this.developerReport = developerReport;
    }

    public abstract double calculateSalary();

}
