package Product1;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }
}

