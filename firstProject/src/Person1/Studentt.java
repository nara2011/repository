package Person1;

	class Student extends Person {
	    Student(String name) {
	        super(name);
	    }
	    @Override
	    void introduce() {
	        super.introduce();
	        System.out.println("Im student");
	    }
}
