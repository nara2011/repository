package localDate;

import java.time.LocalDate;
import java.time.LocalTime;

public class One {
    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2011, 8, 21);
        System.out.println(specificDate);
        System.out.println(specificDate.plusMonths(1));
        System.out.println(specificDate.plusWeeks(2));

        LocalDate currentDate = LocalDate.now();
        LocalDate newDate = currentDate.plusDays(7);
        System.out.println("Дата через 7 дней: " + newDate);
        
        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusMinutes(45);
        System.out.println("Текущее время: " + currentTime);
        System.out.println("Время через 45 минут: " + newTime);
    }
}