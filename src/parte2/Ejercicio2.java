package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);

		// Pedimos la edad
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		// Escribimos si es mayor de edad
		System.out.println("Mayor de edad: " + (edad >= 18));
		
		// Cerramos el escaner
		sc.close();
	}

}
