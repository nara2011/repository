
public class WEEK {

		public static void main(String[] args) {
			 String[][] daysOfWeek = {
			            {"1", "Понедельник"},
			            {"2", "Вторник"},
			            {"3", "Среда"},
			            {"4", "Четверг"},
			            {"5", "Пятница"},
			            {"6", "Суббота"},
			            {"7", "Воскресенье"}
			        };
			 
			 for (int a = 0; a < daysOfWeek.length; a++) {
				for (int b = 0; b < daysOfWeek[a].length; b++) {
					System.out.print(daysOfWeek[a][b] + " ");
					
				}
				System.out.println();
			}
	
		
	}
	}
