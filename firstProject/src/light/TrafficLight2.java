
package light;

public class TrafficLight2 {
	   public static void main(String[] args) {
		      TrafficLight light = TrafficLight.RED;

		        switch (light) {
		            case RED:
		                System.out.println("Остановитесь.");
		                break;

		            case YELLOW:
		                System.out.println("Приготовьтесь.");
		                break;

		            case GREEN:
		                System.out.println("Можно ехать.");
		                break;

		            default:
		                System.out.println("Неизвестный цвет светофора.");
		                break;
		        }
	   }

}
