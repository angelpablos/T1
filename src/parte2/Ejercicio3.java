package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero: ");
		int num = sc.nextInt();
		
		System.out.println("Par: " + (num % 2 == 0));
		

	}

}
