package sistemagestiondeequiposdeportivos;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class JugadorAmateur extends Jugador{
    private double costo_participacion;
    private String nivel_competencia;
    private int torneos_ganados;

    public JugadorAmateur() {
    }

    public JugadorAmateur(double costo_participacion, String nivel_competencia, int torneos_ganados, int codigo_jugador, String nombre, Date fecha_ingreso, int edad, boolean es_activo, Equipo equipo) {
        super(codigo_jugador, nombre, fecha_ingreso, edad, es_activo, equipo);
        setCosto_participacion(costo_participacion);
        setNivel_competencia(nivel_competencia);
        setTorneos_ganados(torneos_ganados);
    }

    public double getCosto_participacion() {
        return costo_participacion;
    }

    public void setCosto_participacion(double costo_participacion) {
        if(costo_participacion > 0){
            this.costo_participacion = costo_participacion;
        }else{
            System.err.println("ERROR: el costo por participación debe ser mayor a 0");
        }
    }

    public String getNivel_competencia() {
        return nivel_competencia;
    }

    public void setNivel_competencia(String nivel_competencia) {
        if(nivel_competencia.trim().equalsIgnoreCase("Principiante")||
                nivel_competencia.trim().equalsIgnoreCase("Intermedio")||
                nivel_competencia.trim().equalsIgnoreCase("Avanzado")){
            this.nivel_competencia = nivel_competencia;
        }else{
            System.err.println("ERROR: el nivel del jugador solo puede ser: Principiante, Intermedio o Avanzado");
        }
    }

    public int getTorneos_ganados() {
        return torneos_ganados;
    }

    public void setTorneos_ganados(int torneos_ganados) {
        if(torneos_ganados >= 0){
            this.torneos_ganados = torneos_ganados;
        }else{
            System.err.println("ERROR: el número de torneos ganados no puede ser un valor negativo");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "JugadorAmateur{" + "costo_participacion=" + costo_participacion + ", nivel_competencia=" + nivel_competencia + ", torneos_ganados=" + torneos_ganados + '}';
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("---- Costo ----");
        System.out.println("Costo por participación: $"+costo_participacion);
        System.out.println("---- Estadistica ----");
        System.out.println("Nivel de competencia: "+nivel_competencia);
        System.out.println("Torneos ganados: "+torneos_ganados+"\n");
    }

    @Override
    public double calcular_aporte() {
        return costo_participacion * PORCENTAJE_APORTE;
    }

    @Override
    public double calcular_costo_total() {
        return costo_participacion - calcular_aporte();
    }
}
