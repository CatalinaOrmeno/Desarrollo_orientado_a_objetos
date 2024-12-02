package Controlador;
import Conexion.ConexionOracle;
import Modelo.Autor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Catalina
 */
public class AutorDAO {
    Connection cone;

    public AutorDAO() {
        cone = new ConexionOracle().getCone();
    }
    
    public boolean agregar_autor(Autor a) throws SQLException{
        boolean resp = false;
        try {
            String sql = "insert into autor values(?,?,?)";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setInt(1, a.getRut());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getNacionalidad());
            
            int num = ps.executeUpdate();
            if(num > 0){
                resp = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return resp;
    }
    public boolean modificar_autor(Autor a) throws SQLException{
        boolean resp = false;
        try {
            String sql = "update autor set nombre =?,nacionalidad=? where rut = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setInt(3, a.getRut());
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getNacionalidad());
            
            int num = ps.executeUpdate();
            if(num > 0){
                resp = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return resp;
    }
    public boolean eliminar_autor(int rut) throws SQLException{
        boolean resp = false;
        try {
            String sql = "delete from autor where rut = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setInt(1, rut);
            
            int num = ps.executeUpdate();
            if(num > 0){
                resp = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return resp;
    }
    public Autor buscar_autor(int rut) throws SQLException{
        Autor a = new Autor();
        try {
            String sql = "select * from autor where rut = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setInt(1, rut);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                a.setRut(rut);
                a.setNombre(rs.getString(2));
                a.setNacionalidad(rs.getString(3));
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return a;
    }
    public List<Autor> listar_autores() throws SQLException{
        List<Autor> autores = new ArrayList<>();
        try {
            String sql = "select * from autor";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Autor a = new Autor();
                a.setRut(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setNacionalidad(rs.getString(3));
                autores.add(a);
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return autores;
    }
}
