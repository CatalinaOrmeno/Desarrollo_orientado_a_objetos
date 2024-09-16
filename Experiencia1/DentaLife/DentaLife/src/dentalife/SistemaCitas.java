package dentalife;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Catalina
 */
public class SistemaCitas {
    private Paciente paciente;
    private Tratamiento tratamiento;
    private Date fecha_cita;

    public SistemaCitas() {
    }

    public SistemaCitas(Paciente paciente, Tratamiento tratamiento, Date fecha_cita) {
        this.paciente = paciente;
        this.tratamiento = tratamiento;
        setFecha_cita(fecha_cita);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        if(fecha_cita.before(new Date())){
            System.err.println("ERROR: la cita no puede ser un día anterior a hoy!");
        }else{
            this.fecha_cita = fecha_cita;
        }
    }

    @Override
    public String toString() {
        return "SistemaCitas{" + "paciente=" + paciente + ", tratamiento=" + tratamiento + ", fecha_cita=" + fecha_cita + '}';
    }
    public void imprimir(){
        paciente.imprimir();
        tratamiento.imprimir();
        System.out.println("Fecha de cita: "+ new SimpleDateFormat("dd-MM-y").format(fecha_cita)+"\n");
    }
    public int descuento(){
        if(paciente.isSeguro_medico()){
            return (int) (tratamiento.getCosto() * 0.2f);
        }else{
            return 0;
        }
    }
    public void suficiencia_tiempo(int minutos_atencion){
        if(tratamiento.getMinutos_duracion() <= minutos_atencion){
            System.out.println("Hay suficiente tiempo para tratar al paciente!");
        }else{
            System.out.println("No hay suficiente tiempo para tratar al paciente!");
        }
    }
    public void calcular_costo(String sistema_salud){
        tratamiento.setCosto(tratamiento.getCosto()- descuento());
        if(sistema_salud.equalsIgnoreCase("Consalud")||sistema_salud.equalsIgnoreCase("Colmena")){
            tratamiento.setCosto((int) (tratamiento.getCosto() * 0.9f));
        }
        tratamiento.setCosto((int) (tratamiento.getCosto() * 1.19));
        
        System.out.println("Calculo de costo total finalizado!\n");
        System.out.println("----- BOLETA -----");
        imprimir();
    }
}
