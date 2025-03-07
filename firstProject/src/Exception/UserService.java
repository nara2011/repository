package Exception;

public class UserService {
	   public void findUser(String username) throws UserNotFoundException {
	        if (!username.equals("admin")) {
	            throw new UserNotFoundException("Пользователь не найден: " + username);
	        }
	        System.out.println("Пользователь найден: " + username);
	    }
}
