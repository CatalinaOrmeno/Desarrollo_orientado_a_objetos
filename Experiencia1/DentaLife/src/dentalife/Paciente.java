package dentalife;

import com.sun.source.tree.ContinueTree;

/**
 *
 * @author Catalina
 */
public class Paciente {
    private String nombre;
    private int edad;
    private char genero;
    private boolean seguro_medico;

    public Paciente() {
    }

    public Paciente(String nombre, int edad, char genero, boolean seguro_medico) {
        this.nombre = nombre;
        this.edad = edad;
        setGenero(genero);
        this.seguro_medico = seguro_medico;
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero == 'M'||
            genero == 'm'||
            genero == 'F'||
            genero == 'f'||
            genero == 'O'||
            genero == 'o'){
            this.genero = genero;
        }else{
            System.err.println("ERROR: el genero ingresado no es valido!");
            System.err.println("Pruebe poner M/m para masculino, F/f para femenino y O/o para otro.");
        }
    }

    public boolean isSeguro_medico() {
        return seguro_medico;
    }

    public void setSeguro_medico(boolean seguro_medico) {
        this.seguro_medico = seguro_medico;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", seguro_medico=" + seguro_medico + '}';
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.print("Genero: ");
        if(genero == 'M'||genero == 'm'){
            System.out.println("Masculino");
        }else if(genero == 'F'||genero == 'f'){
            System.out.println("Femenino");
        }else{
            System.out.println("Otro");
        }
        System.out.print("¿Seguro medico?: ");
        if(seguro_medico){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
