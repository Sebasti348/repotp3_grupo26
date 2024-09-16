package ar.edu.unju.escmi.poo.ejercicio04;

public class Cliente {
	private String dni;
    private String nombre;
    private char categoria;

    // Constructor parametrizado
    public Cliente(String dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    // Método toString() para mostrar la información del cliente
    @Override
    public String toString() {
        return "Cliente [DNI=" + dni + ", Nombre=" + nombre + ", Categoría=" + categoria + "]";
    }
}
