package farmaciacomunitaria;

/**
 *
 * @author Catalina
 */
public class SistemaDeGestionDeInventario {
    private String medicamentoActual;
    private String clienteActual;
    private String proveedorActual;

    public SistemaDeGestionDeInventario() {
    }

    public SistemaDeGestionDeInventario(String medicamentoActual, String clienteActual, String proveedorActual) {
        this.medicamentoActual = medicamentoActual;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    @Override
    public String toString() {
        return "SistemaDeGestionDeInventario{" + "medicamentoActual=" + medicamentoActual + ", clienteActual=" + clienteActual + ", proveedorActual=" + proveedorActual + '}';
    }
}
