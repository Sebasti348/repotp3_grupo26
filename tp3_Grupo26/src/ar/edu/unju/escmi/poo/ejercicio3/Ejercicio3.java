package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Empleado> empleados =new HashSet<>();
		 Scanner lector = new Scanner(System.in);
		 
		 int opcion=0;
		 do {
		
			 System.out.println("MENU DE OPCIONES:");
			 System.out.println("1-Crear empleado");
			 System.out.println("2-Aumentar Salario");
			 System.out.println("3-Mostrar la suma total de todos los salarios");
			 System.out.println("4-Mostrar todos los empleaados");
			 System.out.println("5-Salir");
			 
			 
		 System.out.print("Ingrese una opcion: ");
		 
		 opcion = lector.nextInt();

	        switch (opcion) {
	            case 1:
	                System.out.println("INGRESO DE DATOS DEL EMPLEADO:");
	                System.out.println("Ingrese el nombre:");
	                String nombre = lector.next();
	                System.out.println("Ingrese el legajo:");
	                int legajo = lector.nextInt();
	                System.out.println("Ingrese el salario:");
	                double salario = lector.nextDouble();
	                
	                empleados.add(new Empleado(nombre,legajo,salario));
	                System.out.println("El empleado se creo exitosamente");
	                break;
	                
	            case 2:
	                System.out.println("AUMENTAR SALARIO");
	                System.out.println("Ingrese legajo del empleado:");
	                int legajoA = lector.nextInt();
	                boolean encontrado=false;
	                for (Empleado empleado : empleados) {
	                	if (empleado.getLegajo()== legajoA) {
	                		 empleado.aumentoSalario();
	                		 encontrado = true;
	                		 System.out.println("Salario aumentado con exito");
	                		 break;
	                	}
	                }
	                if (!encontrado) {
	                	System.out.println("No se encontro empleado con ese legajo");	
	                }
	                break;
	               
	            case 3:
	            	System.out.println("SUMA DE TODO LOS SALARIO");
	                double salarioTotal =0;
	                for (Empleado empleado : empleados) {
	                	
	                	salarioTotal = salarioTotal + empleado.getSalario();
	                	
	                }
	                System.out.println("La suma total de todos los salario es igial a: " + salarioTotal);
	                break;
	            case 4:
	            	System.out.println("EMPLEADOS CARGADOS");
	                
	                for (Empleado empleado : empleados) {
	                	empleado.mostrarDatos();
	                	System.out.println();
	                }
	                break;
	            case 5:
	                System.out.println("Saliendo del programa...");
	                break;
	            default:
	                System.out.println("Opcion Invalida, intente de nuevo");
	                break;
	        }
	    
      
		 }while(opcion != 5);
		 
		 lector.close();
	}

}
