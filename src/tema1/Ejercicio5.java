package tema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		double radio;
		double longitud;
		double area;
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el radio
		System.out.println("Introduce el radio: ");
		radio = sc.nextDouble();
		
		// Calculamos longitud y area
		longitud = 2 * Math.PI * radio;
		area = Math.PI * (radio * radio);

		// Escribimos longitud y area en pantalla
		System.out.println("La longitud es: " + longitud + " y el area es " + area);
		
		// Cerramos el escaner
		sc.close();
	}

}
