package product;

import konstruktor.main;

public class otherOne {
	public static void main(String[] args) {
		product product = new product();
		product.setName("Marmelad");
		product.setPrice(5);
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	}

}
