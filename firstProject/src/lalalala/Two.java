package lalalala;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Two {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ASUS\\Desktop\\nara\\reader.txt");

        file.createNewFile();

        FileReader fileReader = new FileReader("C:\\Users\\ASUS\\Desktop\\nara\\reader.txt");
        int symbol;
        while ((symbol = fileReader.read()) != -1) {
            System.out.println((char) symbol);
           
        }
        fileReader.close();
    }
}

