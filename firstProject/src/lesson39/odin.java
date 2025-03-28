package lesson39;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class odin {
public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(24);
    numbers.add(89);
    numbers.add(45);
    numbers.add(9);
    numbers.add(36);
    numbers.add(11);
    numbers.add(5785686);
    numbers.add(5);
    
    System.out.println(numbers);

List<Integer> evenNumbers = numbers.stream().filter(n ->n %2==0).collect(Collectors.toList());

System.out.println(evenNumbers);
    
    

}
}