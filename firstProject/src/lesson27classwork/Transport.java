package lesson27classwork;

public abstract class Transport {
    abstract void start();

    void stop() {
        System.out.println("Транспорт остановился");
    }
}

