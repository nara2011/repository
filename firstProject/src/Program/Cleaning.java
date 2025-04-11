package Program;

public class Cleaning extends Thread {
	 
 	public void run() {
 		for (int b = 1; b<= 5; b++) {
 			System.out.println("Я убираюсь в комнате");
 			try {
                  Thread.sleep(700);
 			} catch (InterruptedException e) {
 			}
 			
 	 }
 			
 	}
 }
