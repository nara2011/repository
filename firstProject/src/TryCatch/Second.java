package TryCatch;

public class Second {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
	        System.err.println("catch");
		}finally {
	        System.out.println("finally");
		}
		
	}
}
