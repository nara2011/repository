package OneOne;

public class Main {
    public static void main(String[] args) {
        MessageBox box = new MessageBox();

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    box.writeMessage();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    box.readMessage();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
}