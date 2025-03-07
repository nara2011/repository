package Exception;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        
        try {
            userService.findUser("user");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}