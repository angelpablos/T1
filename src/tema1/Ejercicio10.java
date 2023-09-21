package tema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		final double IVA = 21;
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("El precio con IVA añadido es: " + (precio + (precio * IVA / 100)));
		
		sc.close();

	}

}
