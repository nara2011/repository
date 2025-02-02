package package1;

public class nomnom {
    public int add(int a, int b) {
        return a + b;
    }

    protected int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }
    public int callDivide(int a, int b) {
        return divide(a, b);
    }

   
}
