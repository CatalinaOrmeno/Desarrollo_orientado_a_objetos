package veterinaria;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Mascota {
    //1. Lo primero siempre es declarar los atributos de la clase:
    private int numero_chip;
    private String nombre;
    private float peso;
    private double tamanio;
    private char genero;
    private boolean vacunas;
    //*El tipo de dato "Date" necesita: import java.util.Date
    private Date fecha_de_nacimiento;
    
    //2. CONSTRUCTOR(ES): nos permite crear objetos a partir de la clase
    public Mascota(int numero_chip, String nombre, float peso, double tamanio, char genero, boolean vacunas, Date fecha_de_nacimiento) {
        this.numero_chip = numero_chip;
        this.nombre = nombre;
        this.peso = peso;
        this.tamanio = tamanio;
        this.genero = genero;
        this.vacunas = vacunas;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public Mascota() {
    }
    
    //3. ACCESADOR(GETTER,GET):
    public int getNumero_chip() {
        return numero_chip;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public double getTamanio() {
        return tamanio;
    }

    public char getGenero() {
        return genero;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public Date getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }
    
    //4. MUTADOR(SETTER,SET): nos permite modificar los valores de un objeto:
    public void setNumero_chip(int numero_chip) {
        this.numero_chip = numero_chip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    
    //5. METODO(funcion->def): son acciones que puede hacer mi clase
    public void imprimir(){
        System.out.println("Número de chip: " + numero_chip);
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso);
        System.out.println("Tamaño: " + tamanio);
        if(this.genero == 'f' || this.genero == 'F'){
            System.out.println("Género: femenino");
        }else if(this.genero == 'm' || this.genero == 'M'){
            System.out.println("Género: Masculino");
        }else{
            System.out.println("Género: Otro");
        }
        if(this.vacunas){
            System.out.println("Vacunas: Si");
        }else{
            System.out.println("Vacunas: No");
        }
        System.out.println("Fecha de nacimiento: " + fecha_de_nacimiento);
    }

    public String ficha() {
        return "Número de chip=" + numero_chip 
                + ", Nombre=" + nombre 
                + ", Peso=" + peso;
    }
}
