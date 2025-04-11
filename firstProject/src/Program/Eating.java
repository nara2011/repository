package Program;

public class Eating  implements Runnable {
	 public void run() {
	 	
	 	for (int b = 1; b<= 5; b++) {
	 		System.out.println("Я завтракаю");
	 		try {
	              Thread.sleep(800);
	 		} catch (InterruptedException e) {
	 		}
	 		
	  }
	 }
	 }