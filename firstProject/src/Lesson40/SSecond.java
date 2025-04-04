package Lesson40;
import java.util.function.Predicate;
public class SSecond {
	public static void main(String[] args) {
	     Predicate<Integer> isEven = num -> num % 2 == 1;
	 
	     System.out.println(isEven.test(13));  
	     System.out.println(isEven.test(829488922)); 
	 
	 }
}
