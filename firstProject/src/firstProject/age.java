package firstProject;

import java.util.Scanner;

public class age {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Введите ваш возраст: ");
	        int age = scanner.nextInt();

	        if (age < 12) {
	            System.out.println("Вы ребёнок.");
	        } else if (age >= 12 && age <= 17) {
	            System.out.println("Вы подросток.");
	        } else if (age >= 18 && age <= 64) {
	            System.out.println("Вы взрослый.");
	        } else if (age >= 65) {
	            System.out.println("Вы пожилой человек.");
	        }else {
	            System.out.println("Введите корректный возраст.");
	        }

	        scanner.close();
	    }

}
