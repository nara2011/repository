package Potok;

public class Draw implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Nara risuet " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
