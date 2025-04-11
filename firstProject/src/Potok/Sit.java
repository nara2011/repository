package Potok;

public class Sit extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Nara gulyaet " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
