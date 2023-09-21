package tema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu direccion: ");
		String direccion = sc.nextLine();
		
		System.out.println("Introduce tu número: ");
		int numero = sc.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Número: " + numero);
		
		
		sc.close();
	}

}
