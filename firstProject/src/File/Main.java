package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ASUS\\Desktop\\nara\\example.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("C:\\Users\\ASUS\\Desktop\\nara\\example.txt");
            writer.write("привет Meleyke");
            writer.close();
            System.out.println("данные записаны");
        } catch (IOException e) {
            System.out.println("данные не записаны");
            e.printStackTrace();
        }
    }
}