package firstProject;
import java.util.Scanner;
public class Backend24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Введите число");
		int number = inputScanner.nextInt();
		int number2 = inputScanner.nextInt();
		number += 7;
		number2 += 7;
		System.out.println(number + number2);
	}

}
