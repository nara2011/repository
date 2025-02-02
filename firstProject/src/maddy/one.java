package maddy;

public class one {
	
	 public String brand;
	    private int speed;

	    public one (String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	    }

	    public void accelerate(int increment) {
	        this.speed += increment;
	    }

	    public void displaySpeed() {
	        System.out.println("Текущая скорость: " + speed + " км/ч");
	    }
	    public String getBrand() {
	        return brand;
	}
}


