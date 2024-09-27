package mundomascotas.entidades;

/**
 *
 * @author Catalina
 */
public class Servicio {
    private String nombre,tipo,descripcion;
    private int precio;

    public Servicio() {
    }

    public Servicio(String nombre, String tipo, String descripcion, int precio) {
        this.nombre = nombre;
        setTipo(tipo);
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean setTipo(String tipo) {
        if(tipo.trim().equalsIgnoreCase("Gato")||tipo.trim().equalsIgnoreCase("Perro")||tipo.isBlank()){
            this.tipo = tipo;
            return true;
        }else{
            System.err.println("ERROR: los servicios solo son para gatos y/o perros");
        }
        return false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Descripción: \n"+descripcion);
        System.out.println("Precio: $"+precio+"\n");
    }
}
