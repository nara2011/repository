package List;
	 import java.util.HashMap;
	 import java.util.Map;
	 
	 public class Three  {
	 	public static void main(String[] args) {
	         Map<String, String> phoneBook = new HashMap<>();
	         phoneBook.put("Nara", "123-456-7890");
	         phoneBook.put("Meleyke", "234-567-8909");
	         
	         phoneBook.forEach((name, phone) -> {
	             System.out.println(name + ": " + phone);
	         });
	     }
	 }

