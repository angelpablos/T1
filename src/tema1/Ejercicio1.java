package tema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		System.out.println("Tu número es: " + num);
		
		sc.close();
	}

}
