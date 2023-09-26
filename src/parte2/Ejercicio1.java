package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializamos variables
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos por los kilos de manzanas
		System.out.println("Introduce el numero de kilos de manzanas: ");
		double dineroManzanas = sc.nextDouble() * PRECIO_MANZANAS;
		
		// Preguntamos por los kilos de peras
		System.out.println("Introduce el numero de kilos de peras: ");
		double dineroPeras = sc.nextDouble() * PRECIO_PERAS;
		
		// Escribimos el resultado de los precios en pantalla
		System.out.println("Se han vendido " + dineroManzanas + "€ de manzanas y " + dineroPeras + "€ de peras");

		// Cerramos el escaner
		sc.close();
	}

}
