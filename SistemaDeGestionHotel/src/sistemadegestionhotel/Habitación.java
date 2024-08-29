/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestionhotel;

/**
 *
 * @author PAAPCA02LC1007
 */
public class Habitación {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponibilidad;
    private char tipoHabitacion;
    private float tamanio;

    public Habitación() {
    }

    public Habitación(int numeroHabitacion, double precioPorNoche, boolean disponibilidad, char tipoHabitacion, float tamaño) {
        setNumeroHabitacion(numeroHabitacion);
        setPrecioPorNoche(precioPorNoche);
        setDisponibilidad(disponibilidad);
        setTipoHabitacion(tipoHabitacion);
        setTamanio(tamaño);
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        if (numeroHabitacion >= 10 && numeroHabitacion <= 99){
            this.numeroHabitacion = numeroHabitacion;
        }else{
            System.err.println("ERROR: número de habitación invalido, puede ser del 10 al 99.");
        }
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        if(precioPorNoche >= 0){
            this.precioPorNoche = precioPorNoche;
        }else{
            System.err.println("ERROR: tiene que ser un número igual o mayor a 0.");
        }
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public char getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(char tipoHabitacion) {
        if(tipoHabitacion == 'S' || tipoHabitacion == 'D'){
            this.tipoHabitacion = tipoHabitacion;
        }else{
            System.err.println("ERROR: la habitación solo puede ser Simple(S) o Doble(D)");
        }
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        if(tamanio >= 4 && tamanio <= 16){
            this.tamanio = tamanio;
        }else{
            System.err.println("ERROR: el tamaño de la habitación debe ser de minimo 4 m^2 y máximo 16 m^2");
        }
    }

    @Override
    public String toString() {
        return "Habitaci\u00f3n{" + "numeroHabitacion=" + numeroHabitacion + ", precioPorNoche=" + precioPorNoche + ", disponibilidad=" + disponibilidad + ", tipoHabitacion=" + tipoHabitacion + ", tama\u00f1o=" + tamanio + '}';
    }
    
    public void mostrarDetalles(){
        System.out.println("Número de habitación: " + numeroHabitacion);
        System.out.println("Precio por noche: " + precioPorNoche);
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Tipo: " + tipoHabitacion);
        System.out.println("Tamaño: " + tamanio);
    }
    public void cambiarDisponibilidad(){
        if (disponibilidad == true){
            setDisponibilidad(false);
        }else{
            setDisponibilidad(true);
        }
    }
}
