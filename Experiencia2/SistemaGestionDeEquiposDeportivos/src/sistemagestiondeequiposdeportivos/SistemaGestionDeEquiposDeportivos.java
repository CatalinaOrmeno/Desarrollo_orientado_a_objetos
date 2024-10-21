package sistemagestiondeequiposdeportivos;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class SistemaGestionDeEquiposDeportivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Organizacion organizacion = new Organizacion();
        Equipo equipo = new Equipo("Partido Peruano", "Segunda división");
        JugadorProfesional j1 = new JugadorProfesional(650000, 50000, 100, 1111, "Juan", new Date(), 35, true, equipo);
        JugadorAmateur j2 = new JugadorAmateur(100000, "intermedio", 5, 1112, "Luis", new Date(), 24, true, equipo);
        System.out.println(organizacion.agregar_jugador(j1) ? "El jugador a sido agregado exitosamente!" : "El jugador ya existia en la base de datos!");
        System.out.println(organizacion.agregar_jugador(j2) ? "El jugador a sido agregado exitosamente!" : "El jugador ya existia en la base de datos!");
        System.out.println();
        j1.imprimir();
        System.out.println("Aporte: $"+j1.calcular_aporte());
        System.out.println("Costo total: $"+j1.calcular_costo_total());
        System.out.println();
        j2.imprimir();
        System.out.println("Aporte: $"+j2.calcular_aporte());
        System.out.println("Costo total: $"+j2.calcular_costo_total());
        //organizacion.Buscar_jugador(1112).imprimir();
        //System.out.println(organizacion.eliminar_jugador(1111) ? "El jugador a sido eliminado exitosamente!" : "El jugador no existia en la base de datos!");
        System.out.println();
        System.out.println("Número de jugadores activos: "+organizacion.contar_jugadores_activos());
        System.out.println("Cantidad de profesionales con un sueldo mayor a $200.000: "+organizacion.contar_profesionales_con_sueldo_mayor_a(200000));
        System.out.println("Costos totales de la organización: $"+organizacion.suma_total_costos());
    }
    
}
