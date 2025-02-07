package dz26;

public class Person {
	    private String name;
	    private int age;
	    private String city;

	    public Person(String name, int age, String city) {
	        this.name = name;
	        this.age = age;
	        this.city = city;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Person person = (Person) obj;
	        return age == person.age && name.equals(person.name);
	    }
}
