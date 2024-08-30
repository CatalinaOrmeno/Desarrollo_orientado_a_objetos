package sistemadegestionhotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Catalina
 */
public class SistemaDeGestionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        double desc = 15.5;
        Habitación h1 = new Habitación(10, 5.5, false, 'S', 4.8f);
        Habitación h2 = new Habitación(11, 12.4, true, 'D', 10.5f);
        /*h1.mostrarDetalles();
        h2.mostrarDetalles();
        h1.cambiarDisponibilidad();
        h2.cambiarDisponibilidad();
        h1.mostrarDetalles();
        h2.mostrarDetalles();*/
        Cliente c1 = new Cliente(1, "Juan", "Gonzalez", false, 'm');
        Cliente c2 = new Cliente(2, "Maria", "Lopez", true, 'f');
        /*c1.mostrarDatosCliente();
        c1.aplicarDescuentoMiembro(desc);
        c2.mostrarDatosCliente();
        c2.aplicarDescuentoMiembro(desc);*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-y");
        Date fecha_salida = sdf.parse("06-09-2024");
        Reserva r1 = new Reserva(1, h1.getNumeroHabitacion(), new Date(), fecha_salida, 5.5);
        int noches = (int) TimeUnit.MILLISECONDS.toDays(fecha_salida.getTime() - r1.getFechaEntrada().getTime());
        c2.mostrarDatosCliente();
        c2.aplicarDescuentoMiembro(desc);
        r1.calcularPrecioTotal(h1.getPrecioPorNoche(), noches);
        r1.setPrecioTotal((r1.getPrecioTotal() * ((100 - desc)/100)));
        r1.mostrarDetallesReserva();
    }
    
}
