package Angel.app.repository;

import Angel.app.Interfaces.EmployeeRepository;
import Angel.app.services.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloudEmployeeRepository implements EmployeeRepository {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Se esta guardando el employee" + employee.getName());
    }

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("Descargando empleados de la nube...");
        return new ArrayList<>(); // Simulación vacía
    }
}
