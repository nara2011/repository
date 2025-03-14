package nyamnyam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	    Person person1 = new Person("Nara","Ahmedova");
	    Person person2 = new Person("Meleyke","Shukurlu");

	    System.out.println(person1.equals(person2));

	    List<Person> peopleList=new ArrayList<Person>();
	    peopleList.add(person1);
	    peopleList.add(person1);
	    peopleList.add(person2);
	    System.out.println(peopleList);

	 Set<Person> peopleSet=new HashSet<Person>();
	    peopleSet.add(person1);
	    peopleSet.add(person1);
	    peopleSet.add(person2);
	    System.out.println(peopleSet);
	}
}
