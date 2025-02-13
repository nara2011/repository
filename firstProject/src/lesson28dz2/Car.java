package lesson28dz2;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Автомобиль заведен");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановлен");
    }
}
