package l36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Person {
String name;
String surname;

public Person(String name,String surname) {
	this.name = name;
	this.surname = surname;
}

@Override
public String toString() {
	return "Person [name=" + name + ", surname=" + surname + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name, surname);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
}
public static void main(String[] args) {
    Person person1 = new Person("Nara","Ahmedova");
    Person person2 = new Person("Emil","Baratov");

    System.out.println(person1.equals(person2));

    List<Person> peopleList = new ArrayList<>();
    peopleList.add(person1);
    peopleList.add(person1);
    peopleList.add(person2);
    System.out.println(peopleList);

    Set<Person> peopleSet = new HashSet<>();
    peopleSet.add(person1);
    peopleSet.add(person1);
    peopleSet.add(person2);
    System.out.println(peopleSet);
}
}
