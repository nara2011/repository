package ExceptionDva;

public class RegistrationService {
	  public void registerUser(int age) throws AgeRestrictionException {
	        if (age < 18) {
	            throw new AgeRestrictionException("Возраст пользователя меньше 18 лет.");
	        }
	        System.out.println("Пользователь зарегистрирован.");
	    }
}
