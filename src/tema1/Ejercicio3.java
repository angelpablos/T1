package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Inicializamos variables
		int nacimiento;
		int actual;
		
		Scanner sc = new Scanner(System.in);
		
		// Leemos la fecha de nacimiento
		System.out.println("Escribe tu fecha de nacimiento: ");
		nacimiento = sc.nextInt();
		
		// Leemos la fecha actual
		System.out.println("Escribe la fecha actual: ");
		actual = sc.nextInt();
		
		// Escribimos la edad en pantalla
		System.out.println("Tienes " + (actual - nacimiento) + " años");
		
		// Cerramos el escaner
		sc.close();
	}

}
