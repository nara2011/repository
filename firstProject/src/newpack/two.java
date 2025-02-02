package newpack;

public class two {
	   public static void main(String[] args) {
	     one student = new one();
	       student.setName("Nara");
			student.setAge(13);
			student.updateGpa(3.9);
		
			System.out.println("Имя: " + student.getName());
			System.out.println("Возраст: " + student.getAge());
			System.out.println("Средний балл: " + student.getGpa());

	}
}

