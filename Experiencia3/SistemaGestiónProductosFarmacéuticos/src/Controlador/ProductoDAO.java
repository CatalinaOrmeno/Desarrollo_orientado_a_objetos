package Controlador;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Catalina
 */
public class ProductoDAO {
    private List<Producto> productos;

    public ProductoDAO() {
        productos = new ArrayList<>();
    }
    
    public boolean agregar_producto(Producto producto) throws Exception{
        if(buscar_producto(producto.getCodigo_barra()) == null){
            return productos.add(producto);
        }
        return false;
    }
    
    public Producto buscar_producto(String codigo_barra) throws Exception{
        for (Producto p : productos) {
            if(p.getCodigo_barra().equalsIgnoreCase(codigo_barra)){
                return p;
            }
        }
        return null;
    }
    
    public boolean modificar_producto(Producto producto) throws Exception{
        if(buscar_producto(producto.getCodigo_barra()) != null){
            productos.set(productos.indexOf(buscar_producto(producto.getCodigo_barra())), producto);
            return true;
        }
        return false;
    }
    
    public boolean eliminar_producto(String codigo_barra) throws Exception{
        if(buscar_producto(codigo_barra) != null){
            return productos.remove(buscar_producto(codigo_barra));
        }
        return false;
    }
    
    public List<Producto> listar_productos(){
        return productos;
    }
}
