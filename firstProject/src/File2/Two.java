package File2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Two {
	  File file = new File("C:\\Users\\ASUS\\Desktop\\nara\\calcucator.txt");
	  try {
			if (file.createNewFile()) {
				System.out.println("Файл создан на рабочем столе");
			} else {
			  System.err.println("Файл не создан");
			}
		} catch (IOException aException) {
			
			aException.printStackTrace();
		}
		
	
       try {
           FileWriter writer = new FileWriter("C:\\Users\\ASUS\\Desktop\\nara\\calcucator.txt");  
          
           for (int i = 1; i <= 10; i++) {
               for (int j = 1; j <= 10; j++) {
                   writer.write(i + " * " + j + " = " + i * j + " ");
               }
               writer.write(" "); 
           }
           

           writer.close();
           System.out.println("Таблица умножения записана в файл!");

       } catch (IOException e) {
       	 System.out.println("Ошибка при записи файла.");
           e.printStackTrace();
       }


   }
}

