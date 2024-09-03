package sistemadegestionhotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Catalina
 */
public class SistemaDeGestionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        do {
            Habitación h = null;
            Cliente c = null;
            Scanner input = new Scanner(System.in);
            System.out.println("SISTEMA DE GESTIÓN DE RESERVAS");
            System.out.println("1.Crear habitación");
            System.out.println("2.Crear Cliente");
            System.out.println("3.Crear Reserva");
            System.out.println("4.Salir");
            System.out.print("¿Que desea hacer?: ");
            try {
                int opc = input.nextInt();
                if(opc == 1){
                    char tipo;
                    System.out.print("Ingrese el número de la habitación: ");
                    int num_habitacion = input.nextInt();
                    System.out.print("Ingrese el precio por noche: ");
                    double precio_por_noche = input.nextDouble();
                    System.out.println("Elija el tipo a acomodaciones de la habitación: ");
                    System.out.println("1.Simple");
                    System.out.println("2.Doble");
                    System.out.print("¿Que tipo de habitación es?: ");
                    int sod = input.nextInt();
                    if(sod == 1){
                        tipo = 'S';
                    }else if(sod == 2){
                        tipo = 'D';
                    }else{
                        System.err.println("ERROR: Tipo no valido");
                        continue;
                    }
                    System.out.print("Ingrese el tamaño de la habitación: ");
                    float tamanio = input.nextFloat();
                    h = new Habitación(num_habitacion, precio_por_noche, true, tipo, tamanio);
                    System.out.println("\nHabitación creada exitosamente!");
                    h.mostrarDetalles();
                }else if(opc == 2){
                    //c = new Cliente()
                }
            } catch (Exception e) {
                System.err.println("ERROR: ingreso no valido");
            }
        } while (true);
    }
    
}
