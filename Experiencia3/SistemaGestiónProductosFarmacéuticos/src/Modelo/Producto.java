package Modelo;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Producto {
    private String codigo_barra, nombre;
    private int stock;
    private double precio;
    private char tipo_producto;
    private boolean disponible;
    private Date fecha_ingreso;

    public Producto() {
    }

    public Producto(String codigo_barra, String nombre, int stock, double precio, char tipo_producto, boolean disponible, Date fecha_ingreso) throws Exception {
        setCodigo_barra(codigo_barra);
        setNombre(nombre);
        setStock(stock);
        setPrecio(precio);
        setTipo_producto(tipo_producto);
        this.disponible = disponible;
        setFecha_ingreso(fecha_ingreso);
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) throws Exception {
        if(!codigo_barra.isBlank()){
            this.codigo_barra = codigo_barra;
        }else{
            throw new Exception("ERROR: el código de barra no puede estar vacio!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(!nombre.isBlank()){
            this.nombre = nombre;
        }else{
            throw new Exception("ERROR: el nombre no puede estar vacio!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws Exception {
        if(stock >= 0){
            this.stock = stock;
        }else{
            throw new Exception("ERROR: el stock debe ser mayor o igual a 0!");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if(precio > 0){
            this.precio = precio;
        }else{
            throw new Exception("ERROR: el precio tiene que ser mayor a 0!");
        }
    }

    public char getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(char tipo_producto) throws Exception {
        if(tipo_producto == 'M' || tipo_producto == 'm' ||
                tipo_producto == 'V' || tipo_producto == 'v' ||
                tipo_producto == 'S' || tipo_producto == 's'){
            this.tipo_producto = tipo_producto;
        }else{
            throw new Exception("ERROR: el tipo de producto solo puede ser: Medicamento(M/m), Vitamina(V/v) o Suplemento(S/s)!");
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) throws Exception {
        if(!fecha_ingreso.after(new Date())){
            this.fecha_ingreso = fecha_ingreso;
        }else{
            throw new Exception("ERROR: la fecha de ingreso no puede ser futura!");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_barra=" + codigo_barra + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + ", tipo_producto=" + tipo_producto + ", disponible=" + disponible + ", fecha_ingreso=" + fecha_ingreso + '}';
    }
    
}
