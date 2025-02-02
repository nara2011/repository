package student;

public class test {
	public static void main(String[] args) {
student student= new student();
System.out.println(student.name);
System.out.println(student.age);
System.out.println(student.grade);
		
student student1= new student("nara",13,"10");
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.grade);
	}

}
