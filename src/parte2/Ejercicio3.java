package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos el numero
		System.out.println("Introduce el numero: ");
		int num = sc.nextInt();
		
		// Escribimos si el numero es par
		System.out.println("Par: " + (num % 2 == 0));
		
		// Cerramos el escaner
		sc.close();
	}

}
