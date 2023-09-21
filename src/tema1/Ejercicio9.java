package tema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		final double PESETAS_EURO = 166;
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce las pesetas: ");
		double pesetas = sc.nextDouble();
		
		System.out.println(pesetas + " pesetas son " + (pesetas / PESETAS_EURO) + " euros");
		
		sc.close();

	}

}
