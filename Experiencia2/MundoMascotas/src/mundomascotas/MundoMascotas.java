package mundomascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mundomascotas.entidades.*;
import mundomascotas.registros.*;

/**
 *
 * @author Catalina
 */
public class MundoMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cita c = new Cita();
        SistemaCitas registro_citas = new SistemaCitas();
        RegistroClientes registro_clientes= new RegistroClientes();
        List<Servicio> lista_servicios = new ArrayList<>();
        Servicio s1 = new Servicio("lavado sanitario", "Gato", "Baño, Limpieza auditiva y lagrimales y Corte de uñas", 20000);
        lista_servicios.add(s1);
        Servicio s2 = new Servicio("lavado sanitario", "Perro", "Baño (sin corte de pelo), Limpieza auditiva y lagrimales, Corte de uñas, Despeje almohadillas", 30000);
        lista_servicios.add(s2);
        Servicio s3 = new Servicio("Desparasitación externa", "", "Visita de un técnico veterinario a domicilio, chequeo de parásitos externos ,y aplicación de antiparasitario interno y externo", 21000);
        lista_servicios.add(s3);
        int codigo = 0;
        int opc = 0;
        do {            
            Cliente cliente = new Cliente();
            System.out.println("---- MUNDO MASCOTAS ----");
            System.out.println("1. Ver registro de citas");
            System.out.println("2. Crear cita");
            System.out.println("3. Modificar cita");
            System.out.println("4. Eliminar cita");
            System.out.println("5. Buscar cita");
            System.out.println("0. Salir");
            System.out.print("¿Que deseas hacer?: ");
            try {
                opc = input.nextInt();
            } catch (Exception InputMismatchException) {
                System.err.println("ERROR: ingreso invalido");
                input.nextLine();
                continue;
            }
            
            if(opc == 1){
                if(registro_citas.getCitas().size()>0){
                    registro_citas.listar_citas();
                }else{
                    System.out.println("No hay registros en la base de datos!");
                }
            }else if(opc == 2){
                while (true) {
                    int rut = 0;
                    int dv = 0;
                    int telefono = 0;
                    //input.nextLine();
                    System.out.println("--- Datos del cliente ---");
                    System.out.print("Ingrese rut: ");
                    try {
                        rut = input.nextInt();
                        cliente.setRun(rut);
                    } catch (Exception InputMismatchException) {
                        System.err.println("ERROR: rut invalido");
                        input.nextLine();
                        continue;
                    }
                    if(registro_clientes.buscar_cliente(rut)== null){
                        System.out.print("Ingrese dijito verificador: ");
                        try {
                            dv = input.nextInt();
                            cliente.setDv(dv);
                        } catch (Exception InputMismatchException) {
                            System.err.println("ERROR: dv invalido");
                            input.nextLine();
                            continue;
                        }
                        System.out.print("Ingrese primer nombre: ");
                        String primer_nombre = input.next().trim();
                        cliente.setPrimer_nombre(primer_nombre);
                        System.out.print("Ingrese segundo nombre: ");
                        String segundo_nombre = input.next().trim();
                        cliente.setSegundo_nombre(segundo_nombre);
                        System.out.print("Ingrese apellido paterno: ");
                        String ap_paterno = input.next().trim();
                        cliente.setAp_paterno(ap_paterno);
                        System.out.print("Ingrese apellido materno: ");
                        String ap_materno = input.next().trim();
                        cliente.setAp_materno(ap_materno);
                        System.out.print("Ingrese dirección: ");
                        String direccion = input.next().trim();
                        cliente.setDireccion(direccion);
                        System.out.print("Ingrese número de teléfono: ");
                        try {
                            telefono = input.nextInt();
                            cliente.setNum_telefono(telefono);
                        } catch (Exception InputMismatchException) {
                            System.err.println("ERROR: telefono invalido");
                            input.nextLine();
                            continue;
                        }
                        registro_clientes.agregar_cliente(cliente);
                        break;
                    }else{
                        System.out.println("\nSe ha encontrado una coincidencia en el sistema");
                        registro_clientes.buscar_cliente(rut).imprimir();
                        System.out.println("¿Quiere continuar con estos datos?(marque 's' para continuar): ");
                        char resp = input.next().trim().toLowerCase().charAt(0);
                        if(resp == 's'){
                            cliente = registro_clientes.buscar_cliente(rut);
                            break;
                        }
                    }
                }
                System.out.println("\nCliente ingresado correctamente!");
            }else if(opc == 3){
            }else if(opc == 4){
            }else if(opc == 5){
            }else if(opc == 0){
                System.out.println("Gracias por usar nuestro sistema!");
                break;
            }else{
                System.err.println("ERROR: la opción ingresada no existe!");
            }
        } while (true);
    }
    
}
