package registrocivil;

/**
 *
 * @author Catalina
 */
public class Vehiculo {
    private String patente,color,marca;
    //Lo siguiente es una colaboración:
    private Persona persona;
    //Al poner la clase persona como un atrivuto, se convierte en una colaboración.

    public Vehiculo() {
    }

    public Vehiculo(String patente, String color, String marca, Persona persona) {
        this.patente = patente;
        this.color = color;
        this.marca = marca;
        this.persona = persona;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", color=" + color + ", marca=" + marca + ", persona=" + persona + '}';
    }
    
    public void imprimir(){
        System.out.println("PATENTE: "+ patente);
        System.out.println("COLOR: "+ color);
        System.out.println("MARCA: "+ marca);
        //Se puede concadenar "\n" para crear una nueva linea, igual que en python.
        persona.imprimir();
        System.out.println("\n");
    }
}
