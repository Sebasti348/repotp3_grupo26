package ar.edu.unju.escmi.poo.ejercicio02;

public class GatoSimple {
    private String color;
    private double peso;
    private String raza;
    private int edad;
    private String nombre;
    private boolean sexo;

    public GatoSimple() {
        // TODO Auto-generated constructor stub
    }

    public GatoSimple(String color, double peso, String raza, int edad, String nombre, boolean sexo) {
        super();
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "GatoSimple [color=" + color + ", peso=" + peso + ", raza=" + raza + ", edad=" + edad + ", nombre="
                + nombre + ", sexo=" + sexo + "]";
    }

    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.toLowerCase().equals("pescado")) {
            System.out.println("Que rico ¡Gracias!!");
        } else {
            System.out.println("Lo siento, yo solo como pescado.");
        }
    }

    public void pelea(GatoSimple gatoContrincante) {
        if (!this.sexo) { // Si es hembra (sexo == false)
            System.out.println("No me gusta pelear");
        } else { // Si es macho (sexo == true)
            if (!gatoContrincante.sexo) { // Si el contrincante es hembra (sexo == false)
                System.out.println("No peleo contra gatitas");
            } else { // Si el contrincante es macho (sexo == true)
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        }
    }
}
