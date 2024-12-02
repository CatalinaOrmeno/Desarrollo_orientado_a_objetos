package Modelo;

/**
 *
 * @author Catalina
 */
public class Autor {
    private int rut;
    private String nombre, nacionalidad;

    public Autor() {
    }

    public Autor(int rut, String nombre, String nacionalidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "rut=" + rut + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
