package Modelo;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Mascota {
    private int codigo;
    private String nombre;
    private Date fecha_nacimineto;
    private double peso;
    private char genero;
    private String origen;
    private boolean vacunado;

    public Mascota() {
    }

    public Mascota(int codigo, String nombre, Date fecha_nacimineto, double peso, char genero, String origen, boolean vacunado) throws Exception {
        this.codigo = codigo;
        setNombre(nombre);
        this.fecha_nacimineto = fecha_nacimineto;
        setPeso(peso);
        this.genero = genero;
        this.origen = origen;
        this.vacunado = vacunado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre.trim().length() > 2){
            this.nombre = nombre;
        }else{
            throw new Exception("ERROR: el nombre de la mascota no puede estar vacio");
        }
    }

    public Date getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(Date fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if(peso > 0){
            this.peso = peso;
        }else{
            throw new Exception("ERROR: el peso tiene que ser mayor a 0");
        }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", fecha_nacimineto=" + fecha_nacimineto + ", peso=" + peso + ", genero=" + genero + ", origen=" + origen + ", vacunado=" + vacunado + '}';
    }
}
