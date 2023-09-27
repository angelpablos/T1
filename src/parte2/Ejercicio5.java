package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int primerTrimestre, segundoTrimestre, tercerTrimestre;
		
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos las notas del primer, segundo y tercer trimestre
		System.out.println("Introduce la nota del primer trimestre: ");
		primerTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del segundo trimestre: ");
		segundoTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del tercer trimestre: ");
		tercerTrimestre = sc.nextInt();
		
		// Calculamos la suma de las tres
		int suma = primerTrimestre + segundoTrimestre + tercerTrimestre;
		
		// Escribimos la nota de las dos formas
		System.out.println("Nota en el boletín: " + (suma / 3));
		System.out.println("Nota en el expediente: " + ((float) suma / 3));

		// Cerramos el escaner
		sc.close();
	}

}
