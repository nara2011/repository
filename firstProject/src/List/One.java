package List;
	import java.util.ArrayList;
	 import java.util.Collections;
	 import java.util.List;
	 public class One {
	 	public static void main(String[] args) {
	         List<Integer> numbers = new ArrayList<>();
	         numbers.add(4);
	         numbers.add(8);
	         numbers.add(9);
	         numbers.add(1);
	         numbers.add(7);
	         numbers.add(6);
	         numbers.add(3);
	         
	         Collections.sort(numbers);
	         System.out.println("Отсортированный список: " + numbers);
	         
	         Collections.shuffle(numbers);
	         System.out.println("Перемешанный список: " + numbers);
	         
	         int max = Collections.max(numbers);
	         System.out.println("Максимальное значение: " + max);
	         
	         int min = Collections.min(numbers);
	         System.out.println("Минимальное значение: " + min);
	     }
	 }

