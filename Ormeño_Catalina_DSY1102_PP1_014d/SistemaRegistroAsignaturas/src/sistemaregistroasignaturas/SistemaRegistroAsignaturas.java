package sistemaregistroasignaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Catalina
 */
public class SistemaRegistroAsignaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        /*Estudiante e1 = new Estudiante("Jorge", 1, 18);
        Estudiante e2 = new Estudiante("Maria", 2, 19);
        Estudiante e3 = new Estudiante("Luis", 3, 20);
        Docente docente = new Docente(12, 1, "Pablo", new SimpleDateFormat("dd-MM-y").parse("1-1-24"));
        Asignatura matematicas = new Asignatura(1, "Matematicas", e3, docente, 3.5f, 7f, 6.5f);
        float nota_presentación1 = matematicas.calcular_nota_presentación();
        matematicas.examen_estudiante(nota_presentación1);
        matematicas.situacion_estudiante(4f, nota_presentación1);
        Asignatura lenguaje = new Asignatura(2, "lenguaje", e2, docente, 4f, 4f, 4f);
        float nota_presentacion2 = lenguaje.calcular_nota_presentación();
        lenguaje.examen_estudiante(nota_presentacion2);
        lenguaje.situacion_estudiante(6f, nota_presentacion2);
        Asignatura ingles = new Asignatura(3, "Ingles", e1, docente, 2f, 2f, 2f);
        float nota_presentacion3 = ingles.calcular_nota_presentación();
        ingles.examen_estudiante(nota_presentacion3);
        ingles.situacion_estudiante(6.9f, nota_presentacion3);*/
        Scanner input = new Scanner(System.in);
        Estudiante estudiante = null;
        Docente docente = null;
        Asignatura asignatura = null;
        do {
            try {
                System.out.println("SISTEMA DE REGISTRO DE ASIGNATURAS");
                System.out.println("1. Crear estudiante");
                System.out.println("2. Crear docente");
                System.out.println("3. Crear asignatura");
                System.out.println("4. Revisar situacion del estudiante");
                System.out.println("5. Salir");
                System.out.print("¿Que deseas hacer?: ");
                int resp = input.nextInt();
                if(resp == 1){
                    if(estudiante == null){
                        estudiante = new Estudiante();
                        System.out.print("Ingrese el rut del estudiante: ");
                        estudiante.setRut(input.nextInt());
                        System.out.print("Ingrese el nombre del estudiante: ");
                        estudiante.setNombre(input.next());
                        System.out.print("Ingrese la edad del estudiante: ");
                        estudiante.setEdad(input.nextInt());
                        System.out.println("El estudiante ha sido creado exitosamente!");
                    }else{
                        System.out.println("El estudiante ya ha sido creado!");
                    }
                }else if(resp == 2){
                    if(docente == null){
                        docente = new Docente();
                        System.out.print("Ingrese el rut del docente: ");
                        docente.setRut(input.nextInt());
                        System.out.print("Ingrese el número del docente: ");
                        docente.setNro_docente(input.nextInt());
                        System.out.print("Ingrese el nombre del docente: ");
                        docente.setNombre(input.next());
                        System.out.print("Ingrese la fecha de ingreso del docente(dd-MM-y): ");
                        docente.setFecha_ingreso(new SimpleDateFormat("dd-MM-y").parse(input.next()));
                        System.out.println("El docente ha sido creado exitosamente!");
                    }else{
                        System.out.println("El docente ya ha sido creado!");
                    }
                }else if(resp == 3){
                    if(estudiante != null && docente != null){
                        asignatura = new Asignatura();
                        System.out.print("Ingrese el código de la asignatura: ");
                        asignatura.setCodigo_asignatura(input.nextInt());
                        System.out.print("Ingrese el nombre de la asignatura: ");
                        asignatura.setNombre(input.next());
                        asignatura.setEstudiante(estudiante);
                        asignatura.setDocente(docente);
                        System.out.print("Ingrese la nota 1 del estudiante "+ estudiante.getNombre() +": ");
                        asignatura.setNota1(input.nextFloat());
                        System.out.print("Ingrese la nota 2 del estudiante "+ estudiante.getNombre() +": ");
                        asignatura.setNota2(input.nextFloat());
                        System.out.print("Ingrese la nota 3 del estudiante "+ estudiante.getNombre() +": ");
                        asignatura.setNota3(input.nextFloat());
                        System.out.println("La asignatura ha sido creado exitosamente!");
                    }else{
                        System.err.println("ERROR: se necesita tener un estudiante y un docente creado!");
                    }
                }else if(resp == 4){
                    if (asignatura != null){
                        float nota_presentacion = asignatura.calcular_nota_presentación();
                        if(! asignatura.examen_estudiante(nota_presentacion)){
                            System.out.print("Ingrese nota del examen: ");
                            asignatura.situacion_estudiante(input.nextFloat(), nota_presentacion);
                        }
                    }else{
                        System.err.println("ERROR: se necesita tener una asignatura creada!");
                    }
                }else if(resp == 5){
                    System.out.println("Gracias por utilizar al programa!");
                    break;
                }
            } catch (Exception e) {
                System.err.println("ERROR: respuesta invalida, tiene que ser un número");
            }
        } while (true);
    }
}
