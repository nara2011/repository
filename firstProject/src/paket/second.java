package paket;

public class second {
	 public static void main(String[] args) {
	        first[] books = new first[3];

	        books[0] = new first("Harry Potter", "Harry Potter2");
	        books[1] = new first("Tom Soyer", "Tom Soyer2");
	        books[2] = new first("Invisible Man", "Invisible Man2");

	        for (int i = 0; i < books.length; i++) {
	            System.out.println(books[i].getBookInfo());
	        }
	        }
	    }


