package lalalala;

public class One {
    public static void main(String[] args) {
        String date = "25.04.2025";

        boolean data = date.matches("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(19|20)\\d\\d$");

        System.out.println("Is the date true? " + data);
    }
}
