package sistemaregistroasignaturas;

/**
 *
 * @author Catalina
 */
public class Estudiante {
    private String nombre;
    private int rut,edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, int rut, int edad) {
        setNombre(nombre);
        this.rut = rut;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(! nombre.isBlank()){
            this.nombre = nombre;
        }else{
            System.err.println("ERROR: el nombre no puede estar vacio");
        }
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 18 && edad <=100){
            this.edad = edad;
        }else{
            System.err.println("ERROR: el estudiante tiene que ser mayor de edad");
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + '}';
    }
    
}
