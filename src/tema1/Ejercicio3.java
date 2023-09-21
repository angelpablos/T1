package tema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int nacimiento;
		int actual;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu fecha de nacimiento: ");
		nacimiento = sc.nextInt();
		System.out.println("Escribe la fecha actual: ");
		actual = sc.nextInt();
		
		System.out.println("Tienes " + (actual - nacimiento) + " años");
		
		sc.close();
	}

}
