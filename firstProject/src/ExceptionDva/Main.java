package ExceptionDva;

public class Main {
	 public static void main(String[] args) {
	        RegistrationService service = new RegistrationService();
	        
	        try {
	            service.registerUser(19);
	        } catch (AgeRegistrationtionException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
