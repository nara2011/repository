package lesson28dz;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
    }
}