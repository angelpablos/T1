package tema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la primera nota: ");
		double primeraNota = sc.nextDouble();
		System.out.println("Escribe la segunda nota: ");
		double segundaNota = sc.nextDouble();
		
		double media = (primeraNota + segundaNota) / 2;
		System.out.println("La media aritmetica de las dos notas es " + media);
		
		sc.close();
	}

}
