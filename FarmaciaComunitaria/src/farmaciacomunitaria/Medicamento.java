package farmaciacomunitaria;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Medicamento {
    /*
    VALIDACIONES:
    1.nombre: minimo 3 letras, sin espacios a la derecha e izquierda.
    2.tipo: analgesico,antibiotico,antidepresivo,vitaminas.
    3.stock: minimo 0, maximo 1.000
    4.caducidad: minima fecha: hoy
    */
    private String codigo,nombre,tipo;
    private int stock;
    private Date caducidad;

    public Medicamento() {
    }

    public Medicamento(String codigo, String nombre, String tipo, int stock, Date caducidad) {
        this.codigo = codigo;
        setNombre(nombre);
        setTipo(tipo);
        setStock(stock);
        setCaducidad(caducidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().length() >= 3) {
            this.nombre = nombre;
        }else{
            System.err.println("ERROR: nombre invalido");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.trim().equalsIgnoreCase("analgesico") || 
                tipo.trim().equalsIgnoreCase("antibiotico") ||
                tipo.trim().equalsIgnoreCase("antidepresivos") ||
                tipo.trim().equalsIgnoreCase("vitaminas")){
            this.tipo = tipo;
        }else{
            System.err.println("ERROR: tipo invalido");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0 && stock <= 1000){
            this.stock = stock;
        }else{
            System.err.println("ERROR: stock invalido");
        }
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        if (caducidad.before(new Date())) {
            System.err.println("ERROR: fecha de caducidad invalida");
        }else{
            this.caducidad = caducidad;
        }
    }

    @Override
    public String toString() {
        return "Medicamento{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + ", caducidad=" + caducidad + '}';
    }
    
    public void imprimir(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Stock: " + stock);
        
        //Personalizar fecha: dia-mes-año
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-y");
        System.out.println("Caducidad: " + sdf.format(caducidad));
    }
    
    public void vender(Cliente cliente){
        if(getStock() != 0){
            setStock(stock - 1);
        }else{
            System.err.println("ERROR: ya no queda stock de ese medicamento");
        }
    }
}
