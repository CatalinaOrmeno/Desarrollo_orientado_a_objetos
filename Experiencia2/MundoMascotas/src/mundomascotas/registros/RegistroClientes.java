package mundomascotas.registros;

import java.util.ArrayList;
import java.util.List;
import mundomascotas.entidades.Cliente;

/**
 *
 * @author Catalina
 */
public class RegistroClientes {
    private List<Cliente> duenios;

    public RegistroClientes() {
        duenios = new ArrayList<>();
    }
    
    public boolean agregar_cliente(Cliente c){
        if(buscar_cliente(c.getRun())==null){
            return duenios.add(c);
        }
        return false;
    }
    
    public Cliente buscar_cliente(int rut){
        for (Cliente duenio : duenios) {
            if(duenio.getRun() == rut){
                return duenio;
            }
        }
        return null;
    }
    
    public boolean actualizar_cliente(Cliente datos_actualizados){
        if(buscar_cliente(datos_actualizados.getRun()) != null){
            duenios.set(duenios.indexOf(datos_actualizados), datos_actualizados);
            return true;
        }
        return false;
    }
    
    public boolean eliminar_cliente(int rut){
        if(buscar_cliente(rut) != null){
            return duenios.remove(buscar_cliente(rut));
        }
        return false;
    }
    
    public void listar_clientes(){
        for (Cliente duenio : duenios) {
            duenio.imprimir();
        }
    }
}
