package farmaciacomunitaria;

/**
 *
 * @author Catalina
 */
public class ProveedorFarmaceutico {
    private String codigoProveedor;
    private String nombre;
    private String medicamentoSuministrado;

    public ProveedorFarmaceutico() {
    }

    public ProveedorFarmaceutico(String codigoProveedor, String nombre, String medicamentoSuministrado) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    @Override
    public String toString() {
        return "ProveedorFarmaceutico{" + "codigoProveedor=" + codigoProveedor + ", nombre=" + nombre + ", medicamentoSuministrado=" + medicamentoSuministrado + '}';
    }
}
