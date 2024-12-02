package Modelo;

import java.util.Date;

/**
 *
 * @author Catalina
 */
public class Libro {
    private String isbn,titulo,editorial;
    private int ejemplares_disponibles;
    private Date fecha_publicacion;
    private String genero;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String editorial, int ejemplares_disponibles, Date fecha_publicacion, String genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.ejemplares_disponibles = ejemplares_disponibles;
        this.fecha_publicacion = fecha_publicacion;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEjemplares_disponibles() {
        return ejemplares_disponibles;
    }

    public void setEjemplares_disponibles(int ejemplares_disponibles) {
        this.ejemplares_disponibles = ejemplares_disponibles;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", ejemplares_disponibles=" + ejemplares_disponibles + ", fecha_publicacion=" + fecha_publicacion + ", genero=" + genero + '}';
    }
    
}
