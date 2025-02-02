import java.util.Scanner;
	
public class maddy2 {

public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Введите строку: ");
	        String input = scanner.nextLine();

	        String a = new StringBuilder(input).reverse().toString();

	        String result = a.replace(' ', '_');

	       	  System.out.println("Результат: " + result);
	    }
	}


    