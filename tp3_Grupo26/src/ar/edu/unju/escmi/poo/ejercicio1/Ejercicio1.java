package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		LocalDate fechaNacimiento;
		ArrayList<Persona> personas = new ArrayList<>();
		String opcion = " ";

		// Bucle principal que muestra el menú de opciones
		while (!opcion.equals("5")) {
			System.out.println("\nMenú de opciones:");
			System.out.println("1 – Crear objeto con Constructor por defecto.");
			System.out.println("2 – Crear objeto con Constructor parametrizado.");
			System.out.println("3 – Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
			System.out.println("4 – Mostrar personas.");
			System.out.println("5 – Salir.");
			System.out.print("Seleccione una opción: ");

			opcion = scanner.next();
			scanner.nextLine();

			switch (opcion) {
			case "1": // Crea una Persona con el constructor por defecto
				Persona persona = new Persona();
				System.out.println("---------------------------------------------");
				System.out.println("Persona creada con el constructor por defecto.");
				System.out.println("---------------------------------------------");
				personas.add(persona);
				break;

			case "2": // Crea una Persona con un constructor parametrizado
				try {
					System.out.print("Ingrese DNI: ");
					int dni = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Ingrese Nombre: ");
					String nombre = scanner.nextLine();
					System.out.print("Ingrese Fecha de Nacimiento (yyyy-MM-dd): ");
					fechaNacimiento = LocalDate.parse(scanner.nextLine());
					System.out.print("Ingrese Domicilio: ");
					String domicilio = scanner.nextLine();
					System.out.print("Ingrese Provincia: ");
					String provincia = scanner.nextLine();
					Persona persona2 = new Persona(dni, nombre, fechaNacimiento, domicilio, provincia);
					System.out.println("---------------------------------------------");
					System.out.println("Persona creada con el constructor parametrizado.");
					System.out.println("---------------------------------------------");
					personas.add(persona2);
				} catch (Exception e) { // Captura cualquier excepción que ocurra
					System.out.println("---------------------------------------------");
					System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
					System.out.println("---------------------------------------------");
				}
				break;

			case "3": // Crea una Persona con el constructor que recibe dni, nombre y fecha de
						// nacimiento
				try {
					System.out.print("Ingrese DNI: ");
					int dni3 = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Ingrese Nombre: ");
					String nombre3 = scanner.nextLine();
					System.out.print("Ingrese Fecha de Nacimiento (yyyy-MM-dd): ");
					fechaNacimiento = LocalDate.parse(scanner.nextLine());
					Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento);
					personas.add(persona3);
					System.out.println("---------------------------------------------");
					System.out.println("Persona creada con el constructor (dni, nombre, fecha de nacimiento).");
					System.out.println("---------------------------------------------");
				} catch (Exception e) { // Captura cualquier excepción que ocurra
					System.out.println("---------------------------------------------");
					System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
					System.out.println("---------------------------------------------");
				}
				break;

			case "4": // Muestra todas las personas almacenadas en la lista
				if (personas.isEmpty()) {
					System.out.println("---------------------------------------------");
					System.out.println("No hay personas registradas.");
					System.out.println("---------------------------------------------");
				} else {
					for (int i = 0; i != personas.size(); i++) {
						System.out.println("---------------------------------------------");
						System.out.println("Persona: " + (i + 1));
						personas.get(i).mostrarDatos();
						System.out.println("---------------------------------------------");
						System.out.println();
					}
				}
				break;

			case "5": // Sale del programa
				System.out.println("---------------------------------------------");
				System.out.println("Saliendo del programa.");
				System.out.println("---------------------------------------------");
				break;

			default:
				System.out.println("---------------------------------------------");
				System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
				System.out.println("---------------------------------------------");
				break;
			}
		}

		scanner.close();
	}

}
