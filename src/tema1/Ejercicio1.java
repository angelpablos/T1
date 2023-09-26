package tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num;
		Scanner sc = new Scanner(System.in);
		
		// Leemos un numero
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		// Mostramos el numero en pantalla
		System.out.println("Tu número es: " + num);
		
		// Cerramos el escaner
		sc.close();
	}

}
