package File2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class One {
	 public static void main(String[] args) {
	        File file = new File("C:\\Users\\ASUS\\Desktop\\nara\\user.txt");

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
	     		FileWriter writer = new FileWriter("C:\\Users\\ASUS\\Desktop\\nara\\user.txt");
	     		writer.write("hello Nara");
	     		writer.close();
	     		System.out.println("данные записаны");
	     		
	     	} catch (Exception e) {
	     		System.out.println("данные не записаны");
	     		e.printStackTrace();
	     	}
	 }
}