package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	// Atributos privados de la clase Persona
	private int dni;
	private String nombre;
	private LocalDate fecha;
	private String domicilio;
	private String provincia;

	// Método para calcular la edad de la persona en años
	public int calcularEdad() {
		if (fecha == null) {
			return 0;
		}
		return Period.between(this.fecha, LocalDate.now()).getYears();
	}

	// Método para verificar si la persona es mayor de edad (18 años o más)
	public boolean esMayorDeEdad() {
		return calcularEdad() >= 18;
	}

	// Método para mostrar los datos de la persona
	public void mostrarDatos() {
		int edad = calcularEdad();
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de Nacimiento: " + fecha);
		System.out.println("Domicilio: " + domicilio);
		System.out.println("Provincia: " + provincia);
		System.out.println("Edad: " + edad);

		if (esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad.");
		} else {
			System.out.println("La persona no es mayor de edad.");
		}
	}

	// Constructor por defecto que no inicializa ningún atributo
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	// Constructor parametrizado que inicializa todos los atributos de la clase
	public Persona(int dni, String nombre, LocalDate fecha, String domicilio, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.domicilio = domicilio;
		this.provincia = provincia;
	}

	// Constructor parametrizado que inicializa solo algunos atributos
	public Persona(int dni, String nombre, LocalDate fecha) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.provincia = "Jujuy";
	}

}
