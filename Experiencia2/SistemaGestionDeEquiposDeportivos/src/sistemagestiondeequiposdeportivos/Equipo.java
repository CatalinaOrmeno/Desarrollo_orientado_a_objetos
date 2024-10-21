package sistemagestiondeequiposdeportivos;

/**
 *
 * @author Catalina
 */
public class Equipo {
    private String nombre,division;

    public Equipo() {
    }

    public Equipo(String nombre, String division) {
        setNombre(nombre);
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length()<=30){
            this.nombre = nombre;
        }else{
            System.err.println("ERROR: el nombre del equipo no puede tener más de 30 caracteres");
        }
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", division=" + division + '}';
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("División: "+division);
    }
}
