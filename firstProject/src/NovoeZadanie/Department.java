package NovoeZadanie;

import java.util.ArrayList;

public class Department {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public double getAverageSalary() {
        if (employees.isEmpty()) return 0.0;

        double sum = 0;
        for (Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum / employees.size();
    }
}
