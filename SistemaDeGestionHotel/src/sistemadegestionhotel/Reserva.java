package sistemadegestionhotel;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Reserva {
    private int numeroReserva, numeroHabitacion;
    private Date fechaEntrada, fechaSalida;
    private double precioTotal;

    public Reserva() {
    }

    public Reserva(int numeroReserva, int numeroHabitacion, Date fechaEntrada, Date fechaSalida, double precioTotal) {
        setNumeroReserva(numeroReserva);
        setNumeroHabitacion(numeroHabitacion);
        setFechaEntrada(fechaEntrada);
        setFechaSalida(fechaSalida);
        setPrecioTotal(precioTotal);
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        if(numeroReserva >= 1){
            this.numeroReserva = numeroReserva;
        }else{
            System.err.println("ERROR: el número de rserva tiene que ser minimo 1.");
        }
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

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        if (fechaEntrada.before(new Date())){
            System.err.println("ERROR: la fecha tiene que ser desde el dia de hoy en adelante.");
        }else{
            this.fechaEntrada = fechaEntrada;
        }
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        if(precioTotal >= 0){
            this.precioTotal = precioTotal;
        }else{
            System.err.println("ERROR: tiene que ser un número igual o mayor a 0.");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "numeroReserva=" + numeroReserva + ", numeroHabitacion=" + numeroHabitacion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", precioTotal=" + precioTotal + '}';
    }
    
    public void calcularPrecioTotal(double precioPorNoche,int noches){
        setPrecioTotal(precioPorNoche * noches);
        System.out.println("...Listo!");
    }
    
    public void mostrarDetallesReserva(){
        System.out.println("Número de reserva: " + numeroReserva);
        System.out.println("Número de habitación: " + numeroHabitacion);
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Precio total: " + precioTotal);
    }
}
