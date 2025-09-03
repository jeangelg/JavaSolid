package Angel.app.Interfaces;

import Angel.app.services.Employee;

import java.util.List;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
