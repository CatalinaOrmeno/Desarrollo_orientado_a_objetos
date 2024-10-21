package sistemagestiondeequiposdeportivos;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class JugadorProfesional extends Jugador{
    private double sueldo_mensual,bono_por_rendimiento;
    private int partidos_jugados;

    public JugadorProfesional() {
    }

    public JugadorProfesional(double sueldo_mensual, double bono_por_rendimiento, int partidos_jugados, int codigo_jugador, String nombre, Date fecha_ingreso, int edad, boolean es_activo, Equipo equipo) {
        super(codigo_jugador, nombre, fecha_ingreso, edad, es_activo, equipo);
        setSueldo_mensual(sueldo_mensual);
        setBono_por_rendimiento(bono_por_rendimiento);
        setPartidos_jugados(partidos_jugados);
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        if(sueldo_mensual > 0){
            this.sueldo_mensual = sueldo_mensual;
        }else{
            System.err.println("ERROR: el sueldo mensual del jugador debe ser mayor a 0");
        }
    }

    public double getBono_por_rendimiento() {
        return bono_por_rendimiento;
    }

    public void setBono_por_rendimiento(double bono_por_rendimiento) {
        if(bono_por_rendimiento > 0){
            this.bono_por_rendimiento = bono_por_rendimiento;
        }else{
            System.err.println("ERROR: el bono por rendimiento del jugador debe ser un valor positivo");
        }
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        if(partidos_jugados >= 0){
            this.partidos_jugados = partidos_jugados;
        }else{
            System.err.println("ERROR: el número de partidos jugados no puede ser un valor negativo");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "JugadorProfesional{" + "sueldo_mensual=" + sueldo_mensual + ", bono_por_rendimiento=" + bono_por_rendimiento + ", partidos_jugados=" + partidos_jugados + '}';
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("---- Salario ----");
        System.out.println("Sueldo mensual: $"+sueldo_mensual);
        System.out.println("Bono por rendimiento: $"+bono_por_rendimiento);
        System.out.println("---- Estadistica ----");
        System.out.println("Partidos jugados: "+partidos_jugados+"\n");
    }

    @Override
    public double calcular_aporte() {
        return sueldo_mensual * PORCENTAJE_APORTE;
    }

    @Override
    public double calcular_costo_total() {
        return sueldo_mensual + bono_por_rendimiento - calcular_aporte();
    }
}
