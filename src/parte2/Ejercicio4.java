package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Esta lloviendo?");
		boolean lloviendo = sc.nextBoolean();
		
		System.out.println("¿Has acabado tus tareas?");
		boolean tareas = sc.nextBoolean();
		
		System.out.println("¿Necesitas ir a la biblioteca?");
		boolean biblioteca = sc.nextBoolean();
		
		boolean canGo = biblioteca;
		
		System.out.println(canGo || (!lloviendo && tareas) ? "Puedes salir" : "No puedes salir");
		sc.close();
	}

}
