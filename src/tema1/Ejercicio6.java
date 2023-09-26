package tema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el primer numero
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		
		// Preguntamos el segundo numero
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		// Escribimos los diferentes calculos en pantalla
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicación: " + (num1 * num2));
		System.out.println("División: " + (num1 / num2));

		// Cerramos el escaner
		sc.close();
	}

}
