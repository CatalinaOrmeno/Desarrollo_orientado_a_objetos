package Controlador;

import Modelo.Mascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Catalina
 */
public class MascotaDAO {
    private List<Mascota> mascotas;

    public MascotaDAO() {
        mascotas = new ArrayList<>();
    }
    
    public boolean agregar_mascota(Mascota mascota){
        if(buscar_mascota(mascota.getCodigo()) == null){
            return mascotas.add(mascota);
        }
        return false;
    }
    
    public Mascota buscar_mascota(int codigo){
        for (Mascota m : mascotas) {
            if(m.getCodigo() == codigo){
                return m;
            }
        }
        return null;
    }
    
    public boolean eliminar_mascota(int codigo){
        if(buscar_mascota(codigo) != null){
            return mascotas.remove(buscar_mascota(codigo));
        }
        return false;
    }
    
    public boolean modificar_mascota(Mascota mascota_modificada){
        if(buscar_mascota(mascota_modificada.getCodigo()) != null){
            mascotas.set(mascotas.indexOf(buscar_mascota(mascota_modificada.getCodigo())), mascota_modificada);
            return true;
        }
        return false;
    }
    
    public List<Mascota> listar_mascotas(){
        return mascotas;
    }
}
