package firstProject;

public class massiv3 {
	public static void main(String[] args) {
		int[] massiv2 = new int[6];
		massiv2[0] = 1;
		massiv2[1] = 2;
		massiv2[2] = 3;
		massiv2[3] = 4;
		massiv2[4] = 5;
		massiv2[5] = 6;

		int max = massiv2[0];
		int min = massiv2[0];

		for (int i = 1; i < massiv2.length; i++) {
			if (massiv2[i] > max) {
				max = massiv2[i];
			}
			if (massiv2[i] < min) {
				min = massiv2[i];
			}
		}
		System.out.println("Максимальное значение в массиве: " + max);
		System.out.println("Минимальное значение в массиве: " + min);
		
		}
	}


