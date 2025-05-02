package Lalalal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class One {
	public static void main(String[] args) {
		List <Integer> numInteger = new ArrayList<>();
		numInteger.add(12);
		numInteger.add(8);
		numInteger.add(3);
		numInteger.add(5);
		if (numInteger.contains(8)) {
			System.out.println(numInteger);
			
			Optional<String> optional= Optional.ofNullable(null);
					System.out.println(optional);
			System.out.println(optional.isEmpty());
			
		}
	}

}
