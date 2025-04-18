package OneOne;

public class MessageBox {
    private boolean hasMessage = false;

    synchronized void writeMessage() throws InterruptedException {
        if (hasMessage) wait();
        hasMessage = true;
        System.out.println("Сообщение отправлено!");
        notify();
    }

    synchronized void readMessage() throws InterruptedException {
        if (!hasMessage) wait();
        hasMessage = false;
        System.err.println("Сообщение прочитано!");
        notify();
    }
}
