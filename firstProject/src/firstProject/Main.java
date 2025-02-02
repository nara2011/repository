
package firstProject;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
	        
//		Scanner scanner = new Scanner(System.in);        
//	      System.out.print("Введите строку: ");
//	       String input = scanner.nextLine();
//	       String trimmedString = input.trim();
//	       String upperCaseString = trimmedString.toUpperCase();
//	        System.out.println("Длина строки: " + upperCaseString.length());
//	       System.out.println("Строка в верхнем регистре: " + upperCaseString);
//	       scanner.close();

	        
	        
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Введите строку: ");
	        String input = scanner.nextLine();
	        String trimmedString = input.trim();
	        String upperCaseString = trimmedString.toUpperCase();
	       String replacedString = upperCaseString.replace(" ", "-");
	       System.out.println("Результат: " + replacedString);
	       scanner.close();
      
	    }

	}



   



