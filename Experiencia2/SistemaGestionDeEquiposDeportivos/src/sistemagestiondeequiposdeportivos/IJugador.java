package sistemagestiondeequiposdeportivos;

/**
 *
 * @author Catalina
 */
public interface IJugador {
    final public double PORCENTAJE_APORTE = 0.05;
    
    public double calcular_aporte();
    public double calcular_costo_total();
}
