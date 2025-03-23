package Product1;

public class Product2 implements Comparable<Product2> {
    String name;
    int price;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(Product2 o) {
        return this.price - o.price;
    }
}
