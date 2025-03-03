package TryCatch;

public class First {
	public static void checkNumber(int number) {
		
		int number1 = 13;

		if (number1 < 18) {
			throw new IllegalArgumentException("Возраст должен быть выше 18!");
		} else {
	        System.out.println("Доступ разрешен");
		}
		
	}
}
