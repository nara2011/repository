package lesson;

public class Destination {

	    String name;
	    String country;
	    double distance;

	    public Destination(String name, String country, double distance) {
	        this.name = name;
	        this.country = country;
	        this.distance = distance;
	    }

	    public Destination(String name, String country) {
	        this.name = name;
	        this.country = country;
	    }

	 
	    public Destination() {}

	    public static void main(String[] args) {
	        Destination destination1 = new Destination("Париж", "Франция", 2300);
	        Destination destination2 = new Destination("Рим", "Италия");
	        Destination destination3 = new Destination();

	        System.out.println(destination1.name + ", " + destination1.country + ": " + destination1.distance + " км");
	        System.out.println(destination2.name + ", " + destination2.country + ": " + destination2.distance + " км");
	        System.out.println(destination3.name + ", " + destination3.country + ": " + destination3.distance + " км");
	    }
	}

