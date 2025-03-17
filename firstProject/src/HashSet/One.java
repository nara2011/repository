
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

        System.out.println("Все введенные имена:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.print("Введите имя для поиска: ");
        String search= scanner.nextLine();
        
        if (names.contains(search)) {
            System.out.println("Имя " + search + " найдено в списке.");
        } else {
            System.out.println("Имя " + search + " не найдено в списке.");
        }
        
        scanner.close();
    }
}

