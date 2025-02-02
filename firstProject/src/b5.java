
public class b5 {
	package firstJavaProject;

	import java.math.BigInteger;

	public class BigIntegerOperations {
	    public static void main(String[] args) {
	        BigInteger firstNumber = new BigInteger("12345678901234567890123456789012345678901234567890");
	        BigInteger secondNumber = new BigInteger("98765432109876543210987654321098765432109876543210");

	        BigInteger sum = firstNumber.add(secondNumber);
	        System.out.println("Сумма: " + sum);

	        BigInteger difference = firstNumber.subtract(secondNumber);
	        System.out.println("Разность: " + difference);
	    }
	}

}
