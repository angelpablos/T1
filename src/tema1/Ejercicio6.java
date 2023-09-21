package tema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicación: " + (num1 * num2));
		System.out.println("División: " + (num1 / num2));

		sc.close();
	}

}
