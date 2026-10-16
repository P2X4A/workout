package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner consola = new Scanner(System.in);

	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	public String pedirDiaRutina() {
		System.out.println("Ingrese el dia de la rutina: ");
		return consola.nextLine();
	}

	public String pedirMusculosTrabajados() {
		System.out.println("Ingrese los musculos Trabajados: ");
		return consola.nextLine();
	}

	public String pedirNotaEntrenamiento() {
		System.out.println("Notas del entrenamiento: ");
		return consola.nextLine();
	}
	
	public int mostrarMenu() {
		System.out.println("""
				1. Registrar Entrenamiento
				2. Listar Entrenamientos
				3. Salir Del Programa
				
				""");
		return consola.nextInt();
	}
	

}
