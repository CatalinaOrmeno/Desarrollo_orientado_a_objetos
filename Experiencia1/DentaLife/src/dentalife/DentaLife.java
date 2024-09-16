package dentalife;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Catalina
 */
public class DentaLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Paciente p1 = new Paciente("Juan", 17, 'm', true);
        Paciente p2 = new Paciente("Maria", 30, 'f', false);
        Tratamiento tratamiento = new Tratamiento("limpieza");
        SistemaCitas cita1 = new SistemaCitas(p1, tratamiento, new SimpleDateFormat("dd-MM-y").parse("20-9-24"));
        cita1.suficiencia_tiempo(30);
        cita1.calcular_costo("consalud");
        SistemaCitas cita2  = new SistemaCitas(p2, tratamiento, new Date());
        cita2.suficiencia_tiempo(20);
        cita2.calcular_costo("colmena");
        //---- MENU ----
        /*
        Scanner input = new Scanner(System.in);
        Paciente paciente = null;
        Tratamiento tratamineto = null;
        SistemaCitas cita = null;
        while (true) {  
            System.out.println("1.Crear paciente");
            System.out.println("2.Crear tratamiento");
            System.out.println("3.Crear cita");
            System.out.println("4.Salir");
            System.out.println("¿Que deseas hacer?: ");
            String resp = input.next();
            if(resp.contentEquals("1")){
                int edad = 0;
                char genero = 0;
                boolean seguro = false;
                System.out.print("Ingrese el nombre del paciente: ");
                String nombre = input.next().trim();
                System.out.print("Ingrese la edad del paciente: ");
                try {
                    edad = input.nextInt();
                } catch (Exception e) {
                    System.err.println("ERROR: solo se pueden ingresar números!");
                    continue;
                }
                System.out.println("¿De que género es el paciente?:");
                System.out.println("1.Femenino");
                System.out.println("2.Masculino");
                System.out.println("3.Otro");
                try {
                    int resp2 = input.nextInt();
                    if(resp2 == 1){
                        genero ='f';
                    }else if(resp2 == 2){
                        genero ='m';
                    }else if(resp2 == 3){
                        genero ='o';
                    }else{
                        System.err.println("ERROR: genero no valido!");
                        continue;
                    } 
                } catch (Exception e) {
                    System.err.println("ERROR: genero no valido!");
                    continue;
                }
                System.out.println("¿El paciente tiene seguro médico?:");
                System.out.println("1.Si");
                System.out.println("2.No");
                try {
                    int resp2 = input.nextInt();
                    if(resp2 == 1){
                        seguro = true;
                    }else if(resp2 == 2){
                        seguro = false;
                    }else{
                        System.err.println("ERROR: seguro médico no valido!");
                        continue;
                    }
                } catch (Exception e) {
                    System.err.println("ERROR: seguro médico no valido!");
                        continue;
                }
                paciente = new Paciente(nombre, edad, genero, seguro);
                System.out.println("\nPaciente creado con exito!");
                paciente.imprimir();
            }else if(resp.contentEquals("2")){
                System.err.println("Opción en desarrollo!");
            }else if(resp.contentEquals("3")){
                System.err.println("Opción en desarrollo!");
            }else if(resp.contentEquals("4")){
                System.out.println("Gracias por utilizar el programa!");
                break;
            }else{
                System.err.println("ERROR: opción invalida!");
            }
        }
        */
    }
}
