package Modelo;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Prestamo {
    private Date fecha_prestamo, fecha_devolucion;
    private String aplica_multa;
    private int total_multa;

    public Prestamo() {
    }

    public Prestamo(Date fecha_prestamo, Date fecha_devolucion, String aplica_multa, int total_multa) {
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.aplica_multa = aplica_multa;
        this.total_multa = total_multa;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getAplica_multa() {
        return aplica_multa;
    }

    public void setAplica_multa(String aplica_multa) {
        this.aplica_multa = aplica_multa;
    }

    public int getTotal_multa() {
        return total_multa;
    }

    public void setTotal_multa(int total_multa) {
        this.total_multa = total_multa;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fecha_prestamo=" + fecha_prestamo + ", fecha_devolucion=" + fecha_devolucion + ", aplica_multa=" + aplica_multa + ", total_multa=" + total_multa + '}';
    }
}
