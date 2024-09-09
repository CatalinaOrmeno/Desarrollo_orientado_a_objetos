package sistemaregistroasignaturas;

/**
 *
 * @author Catalina
 */
public class Asignatura {
    private int codigo_asignatura;
    private String nombre;
    private Estudiante estudiante;
    private Docente docente;
    private float nota1,nota2,nota3;

    public Asignatura() {
    }

    public Asignatura(int codigo_asignatura, String nombre, Estudiante estudiante, Docente docente, float nota1, float nota2, float nota3) {
        this.codigo_asignatura = codigo_asignatura;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getCodigo_asignatura() {
        return codigo_asignatura;
    }

    public void setCodigo_asignatura(int codigo_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo_asignatura=" + codigo_asignatura + ", nombre=" + nombre + ", estudiante=" + estudiante + ", docente=" + docente + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    public float calcular_nota_presentación(){
        float nota_presentacion = ((nota1 * 0.3f)+(nota2 * 0.3f)+(nota3 * 0.4f));
        return nota_presentacion;
    }
    
    public boolean examen_estudiante(float nota_presentacion){
        if(nota_presentacion >= 5){
            System.out.println("El alumno "+ estudiante.getNombre() +" tiene nota de presentación "+ nota_presentacion +", eximido");
            return true;
        }else{
            System.out.println("El alumno "+ estudiante.getNombre() +" tiene nota de presentación "+ nota_presentacion +", rinde examen");
            return false;
        }
    }
    
    public void situacion_estudiante(float nota_examen,float nota_presentacion){
        float nota_final = (nota_examen * 0.4f) + (nota_presentacion * 0.6f);
        if(nota_final >= 4){
            System.out.println("El alumno "+ estudiante.getNombre() +" tiene nota final de "+ nota_final +", aprovado");
        }else{
            System.out.println("El alumno "+ estudiante.getNombre() +" tiene nota final de "+ nota_final +", desaprovado");
        }
    }
}
