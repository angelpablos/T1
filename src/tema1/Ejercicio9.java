package tema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Inicializamos variables
		final double PESETAS_EURO = 166;
		Scanner sc = new Scanner(System.in);	
		
		// Preguntamos las pesetas
		System.out.println("Introduce las pesetas: ");
		double pesetas = sc.nextDouble();
		
		// Escribimos el cambio en pantalla
		System.out.println(pesetas + " pesetas son " + (pesetas / PESETAS_EURO) + " euros");
		
		// Cerramos el escaner
		sc.close();

	}

}
