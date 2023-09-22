package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Mayor de edad: " + (edad >= 18));
		
		sc.close();
	}

}
