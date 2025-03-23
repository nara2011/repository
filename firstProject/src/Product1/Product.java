package Product1;

import java.util.Comparator;

public class Product implements Comparator<Product> {
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
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}


}

