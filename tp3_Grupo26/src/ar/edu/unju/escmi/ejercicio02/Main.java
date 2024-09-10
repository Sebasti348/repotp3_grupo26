package ar.edu.unju.escmi.ejercicio02;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<GatoSimple> gatos = new TreeSet<>((gato1, gato2) -> gato1.getNombre().compareTo(gato2.getNombre()));

        int opcion;

        do {

            System.out.println("Menú de opciones:");
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer a un gato simple");
            System.out.println("3 – Eliminar un gato simple");
            System.out.println("4 – Mostrar todos los gatos");
            System.out.println("5 – Crear gato contrincante para pelear con un gato simple");
            System.out.println("6 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                continue;
            }
            switch (opcion) {
                case 1:
                    // Crear gato simple
                    GatoSimple nuevoGato = crearGato(scanner);
                    gatos.add(nuevoGato);
                    System.out.println("Gato creado y agregado al TreeSet.");
                    break;

                case 2:
                    // Dar de comer a un gato simple
                    System.out.print("Ingrese el nombre del gato a alimentar: ");
                    String nombreGato = scanner.nextLine();
                    GatoSimple gatoEncontrado = buscarGatoPorNombre(gatos, nombreGato);
                    if (gatoEncontrado != null) {
                        System.out.print("Ingrese la comida para el gato: ");
                        String comida = scanner.nextLine();
                        gatoEncontrado.comer(comida);
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 3:
                    // Eliminar un gato simple
                    System.out.print("Ingrese el nombre del gato a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    GatoSimple gatoAEliminar = buscarGatoPorNombre(gatos, nombreEliminar);
                    if (gatoAEliminar != null) {
                        gatos.remove(gatoAEliminar);
                        System.out.println("Gato eliminado.");
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 4:
                    // Mostrar todos los gatos
                    if (gatos.isEmpty()) {
                        System.out.println("No hay gatos creados.");
                    } else {
                        for (GatoSimple gato : gatos) {
                            System.out.println(gato.toString());
                            gato.maullar();
                            gato.ronronear();
                        }
                    }
                    break;

                case 5:
                    // Crear gato contrincante y pelear
                    System.out.println("Ingrese los datos del gato contrincante:");
                    GatoSimple gatoContrincante = crearGato(scanner);
                    gatos.add(gatoContrincante);
                    System.out.print("Ingrese el nombre del gato con el que peleará el contrincante: ");
                    String nombrePelea = scanner.nextLine();
                    GatoSimple gatoParaPelear = buscarGatoPorNombre(gatos, nombrePelea);
                    if (gatoParaPelear != null) {
                        gatoParaPelear.pelea(gatoContrincante);
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }

    // Método auxiliar para crear un gato
    private static GatoSimple crearGato(Scanner scanner) {
        System.out.print("Ingrese el nombre del gato: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el color del gato: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el peso del gato: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la raza del gato: ");
        String raza = scanner.nextLine();
        System.out.print("Ingrese la edad del gato: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el sexo del gato (1 = macho, 2 = hembra): ");//true = macho, false = hembra
        int x = scanner.nextInt();
        boolean sexo;
        if(x==1) {
            sexo = true;
        }
        else {
            sexo = false;
        }

        scanner.nextLine();

        return new GatoSimple(color, peso, raza, edad, nombre, sexo);
    }

    // Método auxiliar para buscar un gato por nombre en el TreeSet
    private static GatoSimple buscarGatoPorNombre(TreeSet<GatoSimple> gatos, String nombre) {
        for (GatoSimple gato : gatos) {
            if (gato.getNombre().equalsIgnoreCase(nombre)) {
                return gato;
            }
        }
        return null;
    }

}
