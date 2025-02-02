package firstProject;

public class massiv2 {
public static void main(String[] args) {
	int[] massiv = new int[5];
	massiv[0] =22;
	massiv[1] = 10;
	massiv[2]= 12;
	massiv[3] = 9;
	massiv[4] = 4;

	for (int i : massiv) {
		System.out.println(i);
	}

	        int[] a2 = {4, 8, 15, 16, 23, 42, 10};
	        int sum = 0;
	        for (int i = 0; i < a2.length; i++) {
	            sum += a2[i];
	        }
	        System.out.println("Сумма:" + sum);   
	}
}
