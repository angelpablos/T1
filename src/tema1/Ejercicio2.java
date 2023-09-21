package tema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca tu edad: ");
		edad = sc.nextInt();
		System.out.println("El año que viene tendras " + (edad + 1) + " años");
		
		sc.close();
	}

}
