package Employee;

	class Manager extends Employee {
	    int teamSize;

	    Manager(String name, String position, int teamSize) {
	        super(name, position);
	        this.teamSize = teamSize;
	    }

	    @Override
	    void displayInfo() {
	        super.displayInfo();
	        System.out.println("Size of team: " + teamSize);
	    }
}
