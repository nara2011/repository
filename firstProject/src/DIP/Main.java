package DIP;

public class Main {
	 public static void main(String[] args) {
	        ConsoleLogger consoleLogger = new ConsoleLogger();
	        App a = new App(consoleLogger);
	        a.start();
	    }
}
