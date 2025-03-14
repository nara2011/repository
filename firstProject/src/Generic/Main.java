package Generic;

public class Main {
	  public static void main(String[] args) {
	        Metod<Integer, String, Double> metod = new Metod<>(13, "Nara", 13.1);
	        metod.printTriple();
	        metod.setFirst(10);
	        metod.setSecond("Meleyke");
	        metod.setThird(10.1);
	        metod.printTriple();
	    }
}