package ar.edu.unju.escmi.poo.ejercicio3;

public class Empleado {

		private String nombre;
		private int legajo;
		private double salario;
		private static final double SALARIO_MINIMO = 300000.00;
		private static final double AUMENTO_MERITOS = 10000.00;
		
		public Empleado(String nombre, int legajo, double salario) {
			// TODO Auto-generated constructor stub
			this.nombre =nombre;
			this.legajo =legajo;	
			if (salario >= SALARIO_MINIMO ) {
				this.salario= salario;
			}
			else {
				this.salario= SALARIO_MINIMO;
			}
		}

		public void mostrarDatos () {
			System.out.println("Nombre: " + nombre);
			System.out.println("Legajo: " + legajo);
			System.out.println("Salario $: " + salario);
			
		}
		
		public void aumentoSalario () {
			salario = salario + AUMENTO_MERITOS;
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getLegajo() {
			return legajo;
		}

		public void setLegajo(int legajo) {
			this.legajo = legajo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
	

}
