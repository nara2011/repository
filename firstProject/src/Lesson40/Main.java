package Lesson40;

public class Main {
public static void main(String[]args) {
	Calculator addCalculator = (a,b) -> a +b ;
	Calculator substractCalculator = (a,b) -> a - b ;
	Calculator multiplyCalculator = (a,b) -> a * b ;
	Calculator devideCalculator = (a,b) -> a % b ;
	
	System.out.println(addCalculator.calculate(7, 5));
	System.out.println(substractCalculator.calculate(6, 1));
	System.out.println(multiplyCalculator.calculate(8, 4));
	System.out.println(devideCalculator.calculate(3,9));
}
}
