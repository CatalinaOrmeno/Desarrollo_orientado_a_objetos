package sistemadegestionhotel;

/**
 *
 * @author Catalina
 */
public class Cliente {
    private int idCliente;
    private String nombre, apellido;
    private boolean esMiembro;
    private char genero;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apellido, boolean esMiembro, char genero) {
        setIdCliente(idCliente);
        setNombre(nombre);
        setApellido(apellido);
        setEsMiembro(esMiembro);
        setGenero(genero);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        if(idCliente >= 1){
            this.idCliente = idCliente;
        }else{
            System.err.println("ERROR: el id tiene que se minimo de 1.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().length() >= 3){
            this.nombre = nombre;
        }else{
            System.err.println("ERROR: el nombre tiene que tener minimo 3 letras");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.trim().length() >= 3){
            this.apellido = apellido;
        }else{
            System.err.println("ERROR: el nombre tiene que tener minimo 3 letras");
        }
    }

    public boolean isEsMiembro() {
        return esMiembro;
    }

    public void setEsMiembro(boolean esMiembro) {
        this.esMiembro = esMiembro;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero == 'F' || genero == 'M' || genero == 'O'){
            this.genero = genero;
        }else{
            System.err.println("ERROR: el genero solo puede ser Femenino(F), Masculino(M) o Otro(O)");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", esMiembro=" + esMiembro + ", genero=" + genero + '}';
    }
    
    public void mostrarDatosCliente(){
        System.out.println("ID del cliente: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("¿Es miembro?: " + esMiembro);
        System.out.println("Género: " + genero);
    }
}
