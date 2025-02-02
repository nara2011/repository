package firstProject;

public class lyalya {
	
	    private int width;
	    private int height;

	    public lyalya(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    public int multiply() {
	        return width * height;
	    }

	    public static void main(String[] args) {

	        lyalya rectangle = new lyalya(5, 10);

	        System.out.println("Площадь прямоугольника: " + rectangle.multiply());
	    }
	}


