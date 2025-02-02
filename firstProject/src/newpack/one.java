package newpack;

public class one {
	
	 private String name;
	 private int age;
	 private double gpa;

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}


		public double getGpa() {
			return gpa;
		}
		
		public void updateGpa(double newGpa) {
			 if (newGpa >= 0.0 && newGpa <= 4.0) {
		            this.gpa = newGpa;
		        } else {
		            System.out.println("Значение должно быть от 0.0 до 4.0.");
		        }
			 }
}

