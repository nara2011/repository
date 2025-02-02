package pack2;

public class Main {
	    public static void main(String[] args) {
	      
	        Runner runner = new Runner("Nara", 10.5);
	        Swimmer swimmer = new Swimmer("Meleyke", 30.0);

	        runner.train();
	        runner.run();
	        swimmer.train();
	        swimmer.swim();
	    }
	}

