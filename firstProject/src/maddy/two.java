package maddy;

public class two {
    public static void main(String[] args) {
        one myCar = new one("Toyota", 50);

        System.out.println("Марка автомобиля: " + myCar.getBrand());
        myCar.displaySpeed();

        myCar.accelerate(20);

        myCar.displaySpeed();
    }
}