
package HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        
        System.out.println("Введите количество имен:");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("\nВсе введенные имена:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.print("\nВведите имя для поиска: ");
        String searchName = scanner.nextLine();
        
        if (names.contains(searchName)) {
            System.out.println("Имя " + searchName + " найдено в списке.");
        } else {
            System.out.println("Имя " + searchName + " не найдено в списке.");
        }
        
        scanner.close();
    }
}

