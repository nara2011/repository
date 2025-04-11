package Program;

public class Podcast extends Thread {
	 public void run() {
	 	for (int b = 1; b<= 5; b++) {
	 		System.out.println("Я слушаю подкаст");
	 		try {
	              Thread.sleep(900);
	 		} catch (InterruptedException e) {
	 		}
	 		
	  }
	 }
	 }
