package Product1;

import java.util.ArrayList;
import java.util.List;


public class Main {
public static void main(String[] args) {
	List<Product> products = new ArrayList<>();
	Product product1 = new Product("Milk", 8);
	Product product2 = new Product("Egg", 2);
	Product product3 = new Product("Kukuruza", 3);

   products.add(product1);
   products.add(product2);
   products.add(product3);
  System.out.println(products);
  products.sort(product1);
  System.out.println(products);

	
}
}
