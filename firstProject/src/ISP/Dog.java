package ISP;

public class Dog implements Walker, Runner {
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}
