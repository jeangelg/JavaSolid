package Angel.app.repository;

import Angel.app.Interfaces.EmployeeRepository;
import Angel.app.services.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeRepository implements EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
