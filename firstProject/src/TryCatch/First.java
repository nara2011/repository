package TryCatch;

public class First {
	public static void main(String[] args) {
		check(20);
	}
	public static void check(int number) {


		if (number < 18) {
			throw new IllegalArgumentException("Возраст должен быть выше 18!");
		} else {
	        System.out.println("Доступ разрешен");
		}
	
	}
}
