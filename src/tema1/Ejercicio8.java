package tema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el nombre
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		// Preguntamos la edad
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		// Escribimos el texto con el nombre y la edad en pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerrramos el escaner
		sc.close();
	}

}
