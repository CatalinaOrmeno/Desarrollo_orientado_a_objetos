package mundomascotas.registros;

import java.util.ArrayList;
import java.util.List;
import mundomascotas.entidades.Cita;

/**
 *
 * @author Catalina
 */
public class SistemaCitas {
    private List<Cita> citas;

    public SistemaCitas() {
        citas = new ArrayList<>();
    }

    public List<Cita> getCitas() {
        return citas;
    }
    
    public boolean agregar_cita(Cita c){
        if(buscar_cita(c.getCliente().getRun()) == null){
            return citas.add(c);
        }
        return false;
    }
    
    public Cita buscar_cita(int codigo_cita){
        for (Cita cita : citas) {
            if(cita.getCodigo()== codigo_cita){
                return cita;
            }
        }
        return null;
    }
    
    public boolean actualizar_cita(Cita datos_actualizados){
        if(buscar_cita(datos_actualizados.getCodigo()) != null){
            citas.set(citas.indexOf(datos_actualizados), datos_actualizados);
            return true;
        }
        return false;
    }
    
    public boolean eliminar_cita(int codigo_cita){
        if(buscar_cita(codigo_cita) != null){
            return citas.remove(buscar_cita(codigo_cita));
        }
        return false;
    }
    
    public void listar_citas(){
        System.out.println("---- Registro de citas ----");
        for (Cita cita : citas) {
            cita.imprimir();
        }
    }
}
