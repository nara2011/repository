package paket;

public class first {
	    private String title;
	    private String author;

	    public first(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    public String getBookInfo() {
	        return "Название книги: " + title + ", Автор: " + author;
	    }
	}

