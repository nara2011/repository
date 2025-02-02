package firstProject;

import java.util.Scanner;


public class zadanie1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Введите первое число: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Введите второе число: ");
	        int num2 = scanner.nextInt();

	        if (num1 > 0 && num2 > 0) {
	            System.out.println("Оба числа положительные");
	        }
	      
	        else if (num1 < 0 && num2 < 0) {
	            System.out.println("Оба числа отрицательные");
	        }

	        else if (num1 % 3 == 0 || num2 % 3 == 0) {
	            System.out.println("Одно из чисел делится на 3");
	        } else {
	            System.out.println("Не выполнено ни одно из условий");
	        }

	        scanner.close();
	    }

}
