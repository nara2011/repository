package lesson39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dva {
	
	    public static void main(String[] args) {
	        String[] array = {"cat", "dog", "frog", "rabbit"};
	        
	     
	        List<String> list = new ArrayList<>(Arrays.asList(array));
	        
	        System.out.println(list);
	    }
	}