package newwww;
public class Transport {

    public static void main(String[] args) {
        TransportType transport = TransportType.Car;

        switch (transport) {
            case Car:
                System.out.println("Вы выбрали тип Car");
                break;

            case Bus:
                System.out.println("Вы выбрали тип Bus");
                break;

            case Train:
                System.out.println("Вы выбрали тип Train");
                break;

            case Plane:
                System.out.println("Вы выбрали тип Plane");
                break;

            default:
                System.out.println("Неизвестный тип transport");
                break;
        }
    }
}