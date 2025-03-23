package Product1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        List<Product2> products = new ArrayList<>();
        Product2 product1 = new Product2("Milk", 8);
        Product2 product2 = new Product2("Egg", 2);
        Product2 product3 = new Product2("Kukuruza", 3);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        System.out.println("Before sorting: " + products);
        Collections.sort(products);
        System.out.println("After sorting: " + products);
    }
}

