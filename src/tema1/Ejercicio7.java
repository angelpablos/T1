package tema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Inicializamos variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el nombre
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		// Preguntamos la direccion
		System.out.println("Introduce tu direccion: ");
		String direccion = sc.nextLine();
		
		// Preguntamos el numero
		System.out.println("Introduce tu número: ");
		numero = sc.nextInt();
		
		// Escribimos los valores en pantalla
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Número: " + numero);
		
		// Cerramos el escaner
		sc.close();
	}

}
