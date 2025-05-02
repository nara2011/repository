package NovoeZadanie;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();

        Employee emp1 = new Employee("Alice", "Developer", 50000);
        Employee emp2 = new Employee("Bob", "Designer", 45000);
        Employee emp3 = new Employee("Charlie", "Manager", 60000);

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        System.out.println("Список сотрудников:");
        department.listEmployees();

        System.out.println("Средняя зарплата отдела: " + department.getAverageSalary());
    }
}

