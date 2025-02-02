package lesson25dz2;

public class Main {
	  public static void main(String[] args) {
	        Car car1 = new Car("Bmw", "blablabla", 2025);
	        car1.displayCarInfo();

	        car1.setBrand("Mers");
	        car1.setModel("nyamnyam");
	        car1.setYear(2025);
	        car1.displayCarInfo();
	    }
}
