package tema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		sc.close();
	}

}
