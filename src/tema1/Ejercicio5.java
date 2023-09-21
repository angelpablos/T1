package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		double radio = sc.nextDouble();
		
		double longitud = 2 * PI * radio;
		double area = PI * (radio * radio);

		System.out.println("La longitud es: " + longitud + " y el area es " + area);
		
		sc.close();
	}

}
