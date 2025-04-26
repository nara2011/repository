package NewOnw;

public class Aaaa {
    public static void main(String[] args) {
        String IpString = "192.168.1.1";
        boolean ipOk = IpString.matches(
            "^((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$"
        );
        System.out.println("IP valid: " + ipOk);

        String username = "user_123";
        String password = "pass1234";

        boolean usernameOk = username.matches("^[a-zA-Z][a-zA-Z0-9_]{3,15}$");
        boolean passwordOk = password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d!@#$%^&*()_+=-]{6,20}$");

        System.out.println("Username valid: " + usernameOk);
        System.out.println("Password valid: " + passwordOk);
    }
}

