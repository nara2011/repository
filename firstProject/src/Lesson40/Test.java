package Lesson40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
public static void main(String[] args) {
	 List<String> strings = new ArrayList<>();
     strings.add("nara");
     strings.add("meleyke");
     strings.add("aylin");
    
     
     Consumer<String> printUpperCaseConsumer = str -> System.out.println(str.toUpperCase());
     
}
}