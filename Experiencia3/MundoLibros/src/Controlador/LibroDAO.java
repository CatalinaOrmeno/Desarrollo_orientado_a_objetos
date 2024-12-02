package Controlador;
import Conexion.ConexionOracle;
import Modelo.Libro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Catalina
 */
public class LibroDAO {
    Connection cone;

    public LibroDAO() {
        cone = new ConexionOracle().getCone();
    }
    public boolean agregar_libro(Libro l) throws SQLException{
        boolean resp = false;
        try {
            String sql = "insert into libro values(?,?,?,?,?,?)";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setString(1, l.getIsbn());
            ps.setString(2, l.getTitulo());
            ps.setString(3, l.getEditorial());
            ps.setInt(4, l.getEjemplares_disponibles());
            ps.setDate(5, new Date(l.getFecha_publicacion().getTime()));
            ps.setString(6, l.getGenero());
            
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
    public boolean modificar_libro(Libro l) throws SQLException{
        boolean resp = false;
        try {
            String sql = "update libro set titulo = ?,editorial =?,ejemplares_disponibles=?,fecha_publicacion=?,genero=? where isbn = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setString(6, l.getIsbn());
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getEditorial());
            ps.setInt(3, l.getEjemplares_disponibles());
            ps.setDate(4, new Date(l.getFecha_publicacion().getTime()));
            ps.setString(5, l.getGenero());
            
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
    public boolean eliminar_libro(String isbn) throws SQLException{
        boolean resp = false;
        try {
            String sql = "delete from libro where isbn = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setString(1, isbn);
            
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
    public Libro buscar_libro(String isbn) throws SQLException{
        Libro l = new Libro();
        try {
            String sql = "select * from libro where isbn = ?";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setString(1, isbn);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                l.setIsbn(isbn);
                l.setTitulo(rs.getString(2));
                l.setEditorial(rs.getString(3));
                l.setEjemplares_disponibles(rs.getInt(4));
                l.setFecha_publicacion(rs.getDate(5));
                l.setGenero(rs.getString(6));
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return l;
    }
    public List<Libro> listar_libros() throws SQLException{
        List<Libro> libros = new ArrayList<>();
        try {
            String sql = "select * from libro";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Libro l = new Libro();
                l.setIsbn(rs.getString(1));
                l.setTitulo(rs.getString(2));
                l.setEditorial(rs.getString(3));
                l.setEjemplares_disponibles(rs.getInt(4));
                l.setFecha_publicacion(rs.getDate(5));
                l.setGenero(rs.getString(6));
                libros.add(l);
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return libros;
    }
}
