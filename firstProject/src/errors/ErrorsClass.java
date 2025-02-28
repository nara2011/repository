package errors;
public class ErrorsClass {
	public static void main(String[] args) {
    try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
	        System.err.println("Ошибка,на ноль не делится");
		}
    
		try {
			String n = null;
			System.out.println(n.length());
		} catch (NullPointerException e) {
	      System.err.println("Ошибка,обращения к null объекту ");
		}

		try {
			int[] number = {1,2,3,4,5,6,7,8,9,10};
			System.out.println(number[11]);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Ошибка,выход за предел массива");
		}

		try {
		  String string = "Nara";
		  int number = Integer.parseInt(string);
		  System.out.println(number);
		} catch (NumberFormatException e) {
			System.err.println("Ошибка,реобразование стороки в число");
		}
	}
}
