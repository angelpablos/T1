package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el radio
		System.out.println("Introduce el radio: ");
		double radio = sc.nextDouble();
		
		// Calculamos longitud y area
		double longitud = 2 * PI * radio;
		double area = PI * (radio * radio);

		// Escribimos longitud y area en pantalla
		System.out.println("La longitud es: " + longitud + " y el area es " + area);
		
		// Cerramos el escaner
		sc.close();
	}

}
