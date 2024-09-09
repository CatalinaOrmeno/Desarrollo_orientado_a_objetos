package sistemaregistroasignaturas;

import com.sun.source.tree.BreakTree;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Docente {
    private int rut,nro_docente;
    private String nombre;
    private Date fecha_ingreso;

    public Docente() {
    }

    public Docente(int rut, int nro_docente, String nombre, Date fecha_ingreso) {
        this.rut = rut;
        this.nro_docente = nro_docente;
        setNombre(nombre);
        setFecha_ingreso(fecha_ingreso);
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getNro_docente() {
        return nro_docente;
    }

    public void setNro_docente(int nro_docente) {
        this.nro_docente = nro_docente;
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

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        if(fecha_ingreso.after(new Date())){
            System.err.println("ERROR: la fecha de ingreso no puede ser posterior a hoy.");
        }else{
            this.fecha_ingreso = fecha_ingreso;
        }
    }

    @Override
    public String toString() {
        return "Docente{" + "rut=" + rut + ", nro_docente=" + nro_docente + ", nombre=" + nombre + ", fecha_ingreso=" + fecha_ingreso + '}';
    }
    
}
