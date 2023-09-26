package tema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Inicializamos variables
		final double IVA = 21;
		Scanner sc = new Scanner(System.in);	
		
		// Preguntamos el precio
		System.out.println("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		// Escribimos el precio añadiendole el IVA
		System.out.println("El precio con IVA añadido es: " + (precio + (precio * IVA / 100)));
		
		// Cerramos el escaner
		sc.close();

	}

}
