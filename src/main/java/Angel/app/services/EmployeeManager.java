package Angel.app.services;

import Angel.app.Interfaces.EmployeeRepository;

public class EmployeeManager {
//    private List<Employee> employees;
    private EmployeeRepository repository;

//    public EmployeeManagerBad() {
//        employees = new ArrayList<>(); //Dependencia concreta
//    }

    public EmployeeManager(EmployeeRepository repository) {
        this.repository = repository; // ✅ Depende de la interfaz
    }

    public void addEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    public void printEmployees() {
        for (Employee e : repository.getAllEmployees()) {
            System.out.println(e.getName() + " - " + e.getPosition()+ " - " + e.getGender());
        }
    }
}
