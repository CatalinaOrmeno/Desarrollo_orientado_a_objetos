package dentalife;

/**
 *
 * @author Catalina
 */
public class Tratamiento {
    private String nombre;
    private int costo;
    private int minutos_duracion;

    public Tratamiento() {
    }

    public Tratamiento(String nombre) {
        setNombre(nombre);
    }

    public Tratamiento(String nombre, int costo, int minutos_duracion) {
        setNombre(nombre);
        this.costo = costo;
        this.minutos_duracion = minutos_duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().equalsIgnoreCase("limpieza")){
            this.nombre = nombre;
            this.costo = 1000;
            this.minutos_duracion = 20;
        }else if(nombre.trim().equalsIgnoreCase("empaste")){
            this.nombre = nombre;
            this.costo = 1500;
            this.minutos_duracion = 35;
        }else if(nombre.trim().equalsIgnoreCase("ortodoncia")){
            this.nombre = nombre;
            this.costo = 3000;
            this.minutos_duracion = 50;
        }else{
            System.err.println("ERROR: el tratamiento ingresado no existe!");
        }
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getMinutos_duracion() {
        return minutos_duracion;
    }

    public void setMinutos_duracion(int minutos_duracion) {
        this.minutos_duracion = minutos_duracion;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "nombre=" + nombre + ", costo=" + costo + ", minutos_duracion=" + minutos_duracion + '}';
    }
    public void imprimir(){
        System.out.println("Tratamiento: "+ nombre);
        System.out.println("Costo: $"+ costo);
        System.out.println("Tiempo de duración: "+ minutos_duracion +" minutos");
    }
}
