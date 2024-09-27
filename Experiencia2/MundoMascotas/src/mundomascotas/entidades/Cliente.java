package mundomascotas.entidades;

/**
 *
 * @author Catalina
 */
public class Cliente {
    private int run,dv;
    private String primer_nombre, segundo_nombre,ap_paterno,ap_materno,direccion;
    private int num_telefono;

    public Cliente() {
    }

    public Cliente(int run, int dv, String primer_nombre, String segundo_nombre, String ap_paterno, String ap_materno, String direccion, int num_telefono) {
        this.run = run;
        this.dv = dv;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.direccion = direccion;
        this.num_telefono = num_telefono;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" + "run=" + run + ", dv=" + dv + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", ap_paterno=" + ap_paterno + ", ap_materno=" + ap_materno + ", direccion=" + direccion + ", num_telefono=" + num_telefono + '}';
    }
    
    public void imprimir(){
        System.out.println("Run-dv: "+run+'-'+dv);
        System.out.println("Nombre completo: "+primer_nombre+' '+segundo_nombre+' '+ap_paterno+' '+ap_materno);
        System.out.println("Dirección: "+direccion);
        System.out.println("Número de telefono: "+num_telefono+"\n");
    }
}
