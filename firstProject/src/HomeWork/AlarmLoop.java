package HomeWork;

public class AlarmLoop {
 	public static void main(String[] args) {
         Thread alarm = new Thread(() -> {
             while (true) {
                 System.out.println("Будильник звенит!");
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     
                 }
             }
         });
 
         alarm.start();
     }
 }
