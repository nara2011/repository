package firstProject;

import java.util.Random;

public class b4 {
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int sum = 0;
	        
	        for (int i = 0; i < 10; i++) {
	            int number = rand.nextInt(50);
	            sum += number;
	            System.out.println("число: " + number);
	        }

	        System.out.println("Сумма всех чисел: " + sum);
	    }
	}



