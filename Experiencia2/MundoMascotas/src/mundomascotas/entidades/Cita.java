package mundomascotas.entidades;

import mundomascotas.entidades.Cliente;
import mundomascotas.entidades.Mascota;
import mundomascotas.entidades.Servicio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Catalina
 */
public class Cita {
    private int codigo;
    private Cliente cliente;
    private Mascota mascota;
    private List<Servicio> servicios;
    private Date fecha_atencion;
    private String forma_contacto;
    private int precio_total;

    public Cita() {
        servicios = new ArrayList<>();
    }

    public Cita(int codigo, Cliente cliente, Mascota mascota, Date fecha_atencion, String forma_contacto) {
        this.codigo = codigo;
        this.mascota = mascota;
        this.cliente = mascota.getDuenio();
        this.fecha_atencion = fecha_atencion;
        this.forma_contacto = forma_contacto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Date getFecha_atencion() {
        return fecha_atencion;
    }

    public void setFecha_atencion(Date fecha_atencion) {
        this.fecha_atencion = fecha_atencion;
    }

    public String getForma_contacto() {
        return forma_contacto;
    }

    public void setForma_contacto(String forma_contacto) {
        this.forma_contacto = forma_contacto;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    private void setPrecio_total() {
        int precio_total = 0;
        for (Servicio servicio : servicios) {
            precio_total += servicio.getPrecio();
        }
        this.precio_total = precio_total;
    }

    @Override
    public String toString() {
        return "Cita{" + "codigo=" + codigo + ", cliente=" + cliente + ", mascota=" + mascota + ", servicios=" + servicios + ", fecha_atencion=" + fecha_atencion + ", forma_contacto=" + forma_contacto + ", precio_total=" + precio_total + '}';
    }

    public void imprimir(){
        System.out.println("Código: "+codigo);
        System.out.println("Cliente:");
        cliente.imprimir();
        System.out.println("Mascota:");
        mascota.imprimir();
        System.out.println("Servicio(s):");
        listar_servicios();
        System.out.println("Total: $"+getPrecio_total());
        System.out.println("Fecha de atención: "+new SimpleDateFormat("dd-MM-y").format(fecha_atencion));
        System.out.println("Forma de contacto: "+forma_contacto);
    }
    
    public boolean agregar_servicio(Servicio servicio){
        if(buscar_servicio(servicio.getNombre()) == null){
            servicios.add(servicio);
            setPrecio_total();
            return true;
        }
        return false;
    }
    
    public Servicio buscar_servicio(String nombre_servicio){
        for (Servicio s : servicios) {
            if(s.getNombre().equals(nombre_servicio)){
                return s;
            }
        }
        return null;
    }
    
    public boolean eliminar_servicio(String nombre){
        if(buscar_servicio(nombre) != null){
            servicios.remove(buscar_servicio(nombre));
            setPrecio_total();
            return true;
        }
        return false;
    }
    
    public void listar_servicios(){
        for (Servicio s : servicios) {
            s.imprimir();
        }
    }
}
