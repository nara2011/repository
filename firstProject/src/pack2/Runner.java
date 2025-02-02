package pack2;

	public class Runner extends Athlete {
	    double distance;
	    public Runner(String name, double distance) {
	        this.name = name; 
	        this.distance = distance;
	    }
	    public void run() {
	        System.out.println("Бегун " + name + " пробежал " + distance + " километров.");
	    }
	}

