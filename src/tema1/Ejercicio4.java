package tema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Inicializamos variables
		double primeraNota;
		double segundaNota;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		// Leemos la primera nota
		System.out.println("Escribe la primera nota: ");
		primeraNota = sc.nextDouble();
		
		// Leemos la segunda nota
		System.out.println("Escribe la segunda nota: ");
		segundaNota = sc.nextDouble();
		
		// Hacemos la media y la escribimos en pantalla
		media = (primeraNota + segundaNota) / 2;
		System.out.println("La media aritmetica de las dos notas es " + media);
		
		// Cerramos el escaner
		sc.close();
	}

}
