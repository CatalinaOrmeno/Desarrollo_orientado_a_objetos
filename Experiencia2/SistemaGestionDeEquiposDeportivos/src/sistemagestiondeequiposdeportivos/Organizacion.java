package sistemagestiondeequiposdeportivos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Catalina
 */
public class Organizacion {
    private List<Jugador> jugadores;

    public Organizacion() {
        jugadores = new ArrayList<>();
    }
    
    public boolean agregar_jugador(Jugador jugador){
        if(Buscar_jugador(jugador.getCodigo_jugador()) == null){
            return jugadores.add(jugador);
        }
        return false;
    }
    
    public Jugador Buscar_jugador(int codigo_jugador){
        for (Jugador j : jugadores) {
            if(j.getCodigo_jugador() == codigo_jugador){
                return j;
            }
        }
        return null;
    }
    
    public boolean actualizar_jugador(Jugador jugador_actualizado){
        if(Buscar_jugador(jugador_actualizado.getCodigo_jugador())!= null){
            jugadores.set(jugadores.indexOf(jugador_actualizado.getCodigo_jugador()), jugador_actualizado);
            return true;
        }
        return false;
    }
    
    public boolean eliminar_jugador(int codigo_jugador){
        if(Buscar_jugador(codigo_jugador) != null){
            return jugadores.remove(Buscar_jugador(codigo_jugador));
        }
        return false;
    }
    
    public void listar_jugadores(){
        for (Jugador j : jugadores) {
            j.imprimir();
        }
    }
    
    public int contar_jugadores_activos(){
        int cont = 0;
        for (Jugador j : jugadores) {
            if(j.isEs_activo()){
                cont++;
            }
        }
        return cont;
    }
    
    public int contar_profesionales_con_sueldo_mayor_a(double sueldo){
        int cont = 0;
        for (Jugador j : jugadores) {
            if(j instanceof JugadorProfesional){
                JugadorProfesional jugador = (JugadorProfesional) j;
                if(jugador.getSueldo_mensual() > sueldo){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public double suma_total_costos(){
        double suma = 0;
        for (Jugador j : jugadores) {
            suma += j.calcular_costo_total();
        }
        return suma;
    }
}
