package List;
	import java.util.HashMap;
	 import java.util.Map;
	 
	 public class Two {
	 	public static void main(String[] args) {
	         Map<Integer, String> numberWords = new HashMap<>();
	         numberWords.put(1, "Один");
	         numberWords.put(2, "Два");
	         numberWords.put(3, "Три");
	         numberWords.put(4, "Четыре");
	         numberWords.put(5, "Пять");
	         
	         numberWords.forEach((number, word) -> {
	             System.out.println(number + ": " + word);
	         });
	     }
}
