package Lesson40;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test2 {
public static void main(String[] args) {

	Predicate<Integer> isEven = a -> a > 10;
	System.out.println(isEven.test(14));
	
	Predicate<String> idkPredicate = a -> a.length() >7;
    System.out.println(idkPredicate.test("Naraa"));
    
    
    Function<String, Integer> lengthFunction = str -> str.length();
    Integer excapleInteger = lengthFunction.apply("Meleyke");
    System.out.println(excapleInteger);
    
    Function<String, String> otherFunction = str -> str.toUpperCase();
    String string = otherFunction.apply("Aylin");
    System.out.println(string);
    
    Consumer<String> wordConsumer = str -> System.out.println(str);
    wordConsumer.accept("Elvin");
    
	Consumer<Integer> printerConsumer = str -> System.out.println(str);
    printerConsumer.accept(24);
    
    Supplier<Double> randomNumberSupplier = () -> Math.random();
    System.out.println(randomNumberSupplier.get());
 
}  
}