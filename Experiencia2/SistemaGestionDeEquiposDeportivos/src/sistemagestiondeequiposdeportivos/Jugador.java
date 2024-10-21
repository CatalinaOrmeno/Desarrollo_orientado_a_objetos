package sistemagestiondeequiposdeportivos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public abstract class Jugador implements IJugador{
    protected int codigo_jugador;
    protected String nombre;
    protected Date fecha_ingreso;
    protected int edad;
    protected boolean es_activo;
    protected Equipo equipo;

    public Jugador() {
    }

    public Jugador(int codigo_jugador, String nombre, Date fecha_ingreso, int edad, boolean es_activo, Equipo equipo) {
        setCodigo_jugador(codigo_jugador);
        setNombre(nombre);
        setFecha_ingreso(fecha_ingreso);
        setEdad(edad);
        this.es_activo = es_activo;
        this.equipo = equipo;
    }

    public int getCodigo_jugador() {
        return codigo_jugador;
    }

    public void setCodigo_jugador(int codigo_jugador) {
        if(codigo_jugador > 0){
            this.codigo_jugador = codigo_jugador;
        }else{
            System.err.println("ERROR: el código del jugador debe ser un valor positivo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length()<=50){
            this.nombre = nombre;
        }else{
            System.err.println("ERROR: el nombre del jugador no puede tener más de 50 caracteres");
        }
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        if(!fecha_ingreso.after(new Date())){
            this.fecha_ingreso = fecha_ingreso;
        }else{
            System.err.println("ERROR: la fecha de ingreso no puede ser en una fecha futura");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 15){
            this.edad = edad;
        }else{
            System.err.println("ERROR: el jugador debe tener al menos 16 años de edad");
        }
    }

    public boolean isEs_activo() {
        return es_activo;
    }

    public void setEs_activo(boolean es_activo) {
        this.es_activo = es_activo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo_jugador=" + codigo_jugador + ", nombre=" + nombre + ", fecha_ingreso=" + fecha_ingreso + ", edad=" + edad + ", es_activo=" + es_activo + ", equipo=" + equipo + '}';
    }
    
    public void imprimir(){
        System.out.println("---- Datos del jugador ----");
        System.out.println("Código: "+codigo_jugador);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de ingreso: "+new SimpleDateFormat("dd/MM/y").format(fecha_ingreso));
        System.out.println("Edad: "+edad);
        System.out.println(es_activo ? "Esta activo" : "Esta inactivo");
        System.out.println("---- Equipo ----");
        equipo.imprimir();
    }
}
