package Controlador;
import Conexion.ConexionOracle;
import Modelo.Prestamo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Catalina
 */
public class PrestamoDAO {
    Connection cone;

    public PrestamoDAO() {
        cone = new ConexionOracle().getCone();
    }
    public boolean agregar_prestamo(Prestamo p) throws SQLException{
        boolean resp = false;
        try {
            String sql = "insert into prestamo values(?,?,?,?)";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ps.setDate(1, new Date(p.getFecha_prestamo().getTime()));
            ps.setDate(2, new Date(p.getFecha_devolucion().getTime()));
            ps.setString(3, p.getAplica_multa());
            ps.setInt(4, p.getTotal_multa());
            
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
    
    public List<Prestamo> listar_prestamos() throws SQLException{
        List<Prestamo> prestamos = new ArrayList<>();
        try {
            String sql = "select * from prestamo";
            PreparedStatement ps = cone.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Prestamo p = new Prestamo();
                p.setFecha_prestamo(rs.getDate(1));
                p.setFecha_devolucion(rs.getDate(2));
                p.setAplica_multa(rs.getString(3));
                p.setTotal_multa(rs.getInt(4));
                prestamos.add(p);
            }
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getMessage());
        } finally {
            cone.close();
        }
        return prestamos;
    }
}
