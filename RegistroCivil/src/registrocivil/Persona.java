package registrocivil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Persona {
    private int rut;
    private String nombre;
    private Date fecha_nacimiento;

    public Persona() {
    }

    public Persona(int rut, String nombre, Date fecha_nacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    public void imprimir(){
        System.out.println("RUT: "+ rut);
        System.out.println("NOMBRE: "+ nombre);
        //desde ahora TODAS la fechas con algún formato:
        System.out.println("FECHA DE NACIMIENTO: "+ new SimpleDateFormat("dd-MM-y").format(fecha_nacimiento)+"\n");
    }
    
}
