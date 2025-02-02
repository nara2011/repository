package firstProject;

import java.math.BigInteger;

	public class BigIntegerOperations {
	    public static void main(String[] args) {
	        BigInteger firstNumber = new BigInteger("108347082374803274082470284750284750");
	        BigInteger secondNumber = new BigInteger("945783479835675879586795867359867598674095867385069");

	        BigInteger sum = firstNumber.add(secondNumber);
	        System.out.println("Сумма: " + sum);

	        BigInteger difference = firstNumber.subtract(secondNumber);
	        System.out.println("Разность: " + difference);
	    }
	}


