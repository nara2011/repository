package firstProject;
import java.util.Scanner;

public class maddy {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Type first one: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Type second one: ");
	        int num2 = scanner.nextInt();

	        if (num1 > 0 || num2 > 0) {
	            System.out.println("one of them is positive.");
	        } else {
	            System.out.println("Both of them are not  positive.");
	        }
	    }
	}


