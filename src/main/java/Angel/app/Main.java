package Angel.app;

import Angel.app.Interfaces.EmployeeRepository;
import Angel.app.models.Gender;
import Angel.app.models.Position;
import Angel.app.repository.CloudEmployeeRepository;
import Angel.app.services.Employee;
import Angel.app.services.EmployeeManager;
import Angel.app.repository.InMemoryEmployeeRepository;

public class Main {
    public static void main(String[] args) {  // Primer repositorio en memoria
        EmployeeRepository repository = new InMemoryEmployeeRepository();
        EmployeeManager manager = new EmployeeManager(repository);

        manager.addEmployee(new Employee("Alice", Gender.FEMALE, Position.MANAGER));
        manager.addEmployee(new Employee("Bob", Gender.MALE, Position.EXECUTIVE));

        System.out.println("=== Empleados en memoria ===");
        manager.printEmployees();

        // Segundo repositorio en la nube
        EmployeeRepository repository2 = new CloudEmployeeRepository();
        EmployeeManager manager2 = new EmployeeManager(repository2);

        manager2.addEmployee(new Employee("Carla", Gender.FEMALE, Position.ADMINISTRATOR));
        manager2.addEmployee(new Employee("David", Gender.MALE, Position.EXECUTIVE));

        System.out.println("=== Empleados en la nube ===");
        manager2.printEmployees();
    }
}