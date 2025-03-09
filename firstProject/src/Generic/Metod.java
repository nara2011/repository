package Generic;

public class Metod<A, B, C> {
    private A first;
    private B second;
    private C third;

    public Metod(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public void setThird(C third) {
        this.third = third;
    }

    public void printTriple() {
        System.out.println(first + ", " + second + ", " + third);
    }
}
