package OCP;

public class Main {
    public static void main(String[] args) {
        HelloMessage helloMessage = new HelloMessage();
        GoodbyeMessage goodbyeMessage = new GoodbyeMessage();
        WelcomeMessage welcomeMessage = new WelcomeMessage();

        System.out.println(helloMessage.getText());
        System.out.println(goodbyeMessage.getText());
        System.out.println(welcomeMessage.getText());
    }
}
