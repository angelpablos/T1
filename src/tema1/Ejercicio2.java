package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Incializamos variables
		int edad;
		Scanner sc = new Scanner(System.in);
		
		// Leemos la edad
		System.out.println("Introduzca tu edad: ");
		edad = sc.nextInt();
		
		// Escribimos la edad en pantalla
		System.out.println("El año que viene tendras " + (edad + 1) + " años");
		
		// Cerramos el escaner
		sc.close();
	}

}
