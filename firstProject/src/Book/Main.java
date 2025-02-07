package Book;

public class Main {
	public static void main(String[] args) {
        Book book1 = new Book("First Book", "idk", 1949);
        Book book2 = new Book("Second Book", "idk", 1949);
        Book book3 = new Book("Third Book", "idk", 1932);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
    }
}

