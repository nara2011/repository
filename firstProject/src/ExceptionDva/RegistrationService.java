package ExceptionDva;

public class RegistrationService {
	  public void registerUser(int age) throws AgeRegistrationtionException {
	        if (age < 18) {
	            throw new AgeRegistrationtionException("Возраст пользователя меньше 18 лет.");
	        }
	        System.out.println("Пользователь зарегистрирован.");
	    }
}
