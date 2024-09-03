package registrocivil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Catalina
 */
public class RegistroCivil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Crear objetos:
        /*Persona p1 = new Persona(12345678, "Luis", new Date());
        Vehiculo v1 = new Vehiculo("HHLL66", "rojo", "Hyundai", p1);
        v1.imprimir();
        Vehiculo v2 = new Vehiculo("JJKK75", "blanco", "Alpha romeo", p1);
        v2.imprimir();*/
        
        //2.Crear menú:
        /*
        BUCLES:
        while (true) {            
            break;
        }
        
        do {            
            break;
        } while (true);
        
        for (int i = 0; i < 10; i++) {
            break;
        }*/
        Scanner input = new Scanner(System.in);
        Persona p = null;
        do {            
            System.out.println("MENÚ");
            System.out.println("1.Crear persona");
            System.out.println("2.Crear vehiculo");
            System.out.println("3.Salir");
            System.out.print("Ingrese opción: ");
            int opc = input.nextInt();
            try {
                if(opc == 1){
                    System.out.print("Ingrese el rut: ");
                    int rut = input.nextInt();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = input.next();
                    System.out.print("Ingrese la fecha de nacimiento (dd-MM-yyyy): ");
                    String fecha_nacimiento = input.next();
                    p = new Persona(rut, nombre, new SimpleDateFormat("dd-MM-y").parse(fecha_nacimiento));
                    System.out.println("\nPersona creada correctamente!");
                    p.imprimir();
                }else if(opc == 2){
                    if(p != null){
                        System.out.print("Ingrese la patente: ");
                        String patente = input.next();
                        System.out.print("Ingrese la color: ");
                        String color = input.next();
                        System.out.print("Ingrese la marca: ");
                        String marca = input.next();
                        Vehiculo v = new Vehiculo(patente, color, marca, p);
                        System.out.println("Vehiculo creado correctamente!");
                        v.imprimir();
                    }else{
                        System.err.println("ERROR: tiene que crear a una persona primero!");
                    }
                }else if(opc == 3){
                    break;
                }else{
                    System.err.println("ERROR: opción incorrecta!");
                }
            } catch (Exception e) {
                System.err.println("ERROR: ingreso no valido!");
            }
        } while (true);
    }
    
}