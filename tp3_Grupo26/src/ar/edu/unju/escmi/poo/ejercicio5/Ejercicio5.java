package ar.edu.unju.escmi.poo.ejercicio5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Ejercicio5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de producto.");
            System.out.println("2 - Mostrar productos.");
            System.out.println("3 - Incrementar precio de productos.");
            System.out.println("4 - Ordenar productos.");
            System.out.println("5 - Filtrar productos.");
            System.out.println("6 - Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código del producto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    productos.add(new Producto(codigo, descripcion, precio));
                    break;

                case 2:
                    System.out.println("\nLista de productos:");
                    productos.stream().forEach(System.out::println);
                    break;

                case 3:
                    productos = productos.stream()
                            .map(p -> {
                                p.setPrecio(p.getPrecio() + 300.0);
                                return p;
                            })
                            .collect(Collectors.toList());
                    System.out.println("Precios incrementados en 300.00 $");
                    break;

                case 4:
                    productos.sort(Comparator.comparingInt(Producto::getCodigo));
                    System.out.println("\nProductos ordenados por código:");
                    productos.forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Ingrese un código para filtrar: ");
                    int codigoFiltro = scanner.nextInt();
                    List<Producto> productosFiltrados = productos.stream()
                            .filter(p -> p.getCodigo() > codigoFiltro)
                            .collect(Collectors.toList());
                    System.out.println("\nProductos filtrados:");
                    productosFiltrados.forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
