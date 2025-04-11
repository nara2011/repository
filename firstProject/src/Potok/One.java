package Potok;

public class One {
    public static void main(String[] args) {
        Sit sit = new Sit();
        sit.start();

        Thread drawThread = new Thread(new Draw());
        drawThread.start();
    }
}
