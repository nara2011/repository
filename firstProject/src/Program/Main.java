package Program;

public class Main {
	 public static void main(String[] args) {
	 	Cleaning cleaning = new Cleaning();
	 	cleaning.start();
	 	
	 	Podcast podcast = new Podcast();
	 	podcast.start();
	 	
	 	Thread eating = new Thread(new Eating());
	 	eating.start();
	 	
	 	
	 	}
	 }
