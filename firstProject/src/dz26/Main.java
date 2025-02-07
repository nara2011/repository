package dz26;

public class Main {
	 public static void main(String[] args) {
	        Person person1 = new Person("Nara", 13, "Baku");
	        Person person2 = new Person("Meleyke", 10, "Baku");
	        Person person3 = new Person("Aylin", 12, "Baku");

	        System.out.println(person1);
	        System.out.println(person2);
	        System.out.println(person3);

	        System.out.println("person1 equals person2: " + person1.equals(person2));
	        System.out.println("person1 equals person3: " + person1.equals(person3));
	    }
}
