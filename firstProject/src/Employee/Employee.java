package Employee;

public class Employee {
	 String name;
	    String position;

	    Employee(String name, String position) {
	        this.name = name;
	        this.position = position;
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name + ", Position: " + position);
	    }
}
