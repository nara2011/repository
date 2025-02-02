package firstProject;

public class m2 {
	    public static void main(String[] args) {
	        int num1 = 5;
	        int num2 = 8;
	       int  num3 = 9;
	        System.out.println("Максимальное число: " + findMax(num1, num2, num3));
	    }

	    public static int findMax(int a, int b, int c) {
	        if (a >= b && a >= c) {
	            return a;
	        } else if (b >= a && b >= c) {
	            return b;
	        } else {
	            return c;
	        }
	    }
	}

