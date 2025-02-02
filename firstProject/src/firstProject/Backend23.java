package firstProject;

import java.util.Scanner;

public class Backend23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Введите число");
		int number = inputScanner.nextInt();
		number *= number;
		number -= 15;
		System.out.println(number);

	}
}
