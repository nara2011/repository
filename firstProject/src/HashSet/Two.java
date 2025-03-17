package HashSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
 
        System.out.println("Уникальные числа:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        scanner.close();
    }
}


