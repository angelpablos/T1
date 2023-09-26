package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos las notas del primer, segundo y tercer trimestre
		System.out.println("Introduce la nota del primer trimestre: ");
		int primerTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del segundo trimestre: ");
		int segundoTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del tercer trimestre: ");
		int tercerTrimestre = sc.nextInt();
		
		// Calculamos la suma de las tres
		int suma = primerTrimestre + segundoTrimestre + tercerTrimestre;
		
		// Escribimos la nota de las dos formas
		System.out.println("Nota en el boletín: " + (suma / 3));
		System.out.println("Nota en el expediente: " + ((float) suma / 3));

		// Cerramos el escaner
		sc.close();
	}

}
