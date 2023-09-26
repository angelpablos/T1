package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Inicializamos variables
		Scanner sc = new Scanner(System.in);

		// Preguntamos si esta lloviendo
		System.out.println("¿Esta lloviendo?");
		boolean lloviendo = sc.nextBoolean();
		
		// Preguntamos si ha acabado las tareas
		System.out.println("¿Has acabado tus tareas?");
		boolean tareas = sc.nextBoolean();
		
		// Preguntamos si necesita ir a la biblioteca
		System.out.println("¿Necesitas ir a la biblioteca?");
		boolean biblioteca = sc.nextBoolean();
		
		// Escribimos si puede salir o no usando logica muy avanzada
		System.out.println(biblioteca || (!lloviendo && tareas) ? "Puedes salir" : "No puedes salir");
		
		// Cerramos el escaner
		sc.close();
	}

}
