package mundomascotas.entidades;

/**
 *
 * @author Catalina
 */
public class Mascota {
    private int num_chip;
    private String nombre;
    private int edad;
    private double peso;
    private String especie,raza;
    private Cliente duenio;

    public Mascota() {
    }

    public Mascota(int num_chip, String nombre, int edad, double peso, String especie, String raza, Cliente duenio) {
        this.num_chip = num_chip;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        setEspecie(especie);
        this.raza = raza;
        this.duenio = duenio;
    }

    public int getNum_chip() {
        return num_chip;
    }

    public void setNum_chip(int num_chip) {
        this.num_chip = num_chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean setEspecie(String especie) {
        if(especie.trim().equalsIgnoreCase("Gato")||especie.trim().equalsIgnoreCase("Perro")){
            this.especie = especie;
            return true;
        }else{
            System.err.println("ERROR: la mascota solo puede ser un gato o un perro");
        }
        return false;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_chip=" + num_chip + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", tipo=" + especie + ", raza=" + raza + ", duenio=" + duenio + '}';
    }    
    
    public void imprimir(){
        System.out.println("Número de chip: "+num_chip);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso+" Kg");
        System.out.println("Especie: "+especie);
        System.out.println("Raza: "+raza);
        System.out.println("Dueño:");
        duenio.imprimir();
    }
}
