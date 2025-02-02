package firstProject;

import java.util.Scanner;

public class kalkulyatir {
	
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Введите первое число: ");
		 double num1 = scanner.nextDouble();
		 System.out.print("Введите оператор (+, -, *, /): ");
		 char operator = scanner.next().charAt(0);
		 System.out.print("Введите второе число: ");
		 double num2 = scanner.nextDouble();
		 switch (operator) {
		 case '+':System.out.println(num1 + num2); break;
		 case '-':System.out.println(num1 - num2); break;
		 case'*': System.out.println(num1 * num2); break;
		 case '/': System.out.println(num2 != 0 ? num1 / num2: "Ошибка: деление на nоль,"); break;
		 default:System.out .println("Не правильно.");
		 	
		 }
		 		
	 }

}
