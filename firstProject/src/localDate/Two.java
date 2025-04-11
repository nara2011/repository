package localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Two {
	public static void main(String[] args) {
	 	
		LocalDate spesificDate = LocalDate.of(2017, 3, 25);
	 	System.out.println(spesificDate);
	 	
	 	LocalDate date = LocalDate.now();
	 	System.out.println(date);
	 
	 	LocalTime time = LocalTime.now();
	 	System.out.println(time);
	 	
	 	LocalTime specificTime1 = LocalTime.of(5, 20);
	 	System.out.println(specificTime1);
	 	
	 	LocalTime specificTime2 = LocalTime.of(5, 20, 34);
	 	System.out.println(specificTime2);
	 	
	 	LocalTime specificTime3 = LocalTime.of(5, 20, 34, 143);
	 	System.out.println(specificTime3);
	 	
	 	 LocalDateTime dateTime = LocalDateTime.now();
	 	 System.out.println(dateTime);
	 	 
	 	 LocalDateTime specificDateTime = LocalDateTime.of(2024, 6, 25, 14, 00);
	 	 System.out.println(specificDateTime);
	 	 
	 	 
	 	 ZonedDateTime  zonedDateTime =  ZonedDateTime.now();
	 	 System.out.println(zonedDateTime);
	 
	 	}
}
