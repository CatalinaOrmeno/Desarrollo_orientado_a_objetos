package farmaciacomunitaria;

/**
 *
 * @author Catalina
 */
public class Cliente {
    private String numeroCliente;
    private String nombre;
    private String medicamentoAdquirido;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String medicamentoAdquirido) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", medicamentoAdquirido=" + medicamentoAdquirido + '}';
    }
    
    public void imprimir(){
        System.out.println("Número: " + numeroCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Medicamento Adquirido: " + medicamentoAdquirido);
    }
    
    public void realizarCompra(Medicamento m){
        if(m.getStock() != 0){
            m.setStock(m.getStock() - 1);
        }else{
            System.err.println("ERROR: ya no queda stock de ese medicamento");
        }
    }
    
    public void devolverMedicamento(){
        
    }
}
