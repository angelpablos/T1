package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer trimestre: ");
		int primerTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del segundo trimestre: ");
		int segundoTrimestre = sc.nextInt();
		
		System.out.println("Introduce la nota del tercer trimestre: ");
		int tercerTrimestre = sc.nextInt();
		
		int suma = primerTrimestre + segundoTrimestre + tercerTrimestre;
		System.out.println("Nota en el boletín: " + (suma / 3));
		System.out.println("Nota en el expediente: " + ((float) suma / 3));

		sc.close();
	}

}
