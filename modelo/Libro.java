package modelo;

public class Libro {
    private String  titulo, autor;
    private Boolean edicion; 

    public Libro( String titulo, String autor,Boolean edicion) {
        this.edicion = edicion;
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor =" + autor + ", titulo=" + titulo + ", edicion =" + edicion+ '}';
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getEdicion() {
        return edicion;
    }

    public void setEdicion(Boolean edicion) {
        this.edicion = edicion;
    }
    public static void agregarLibro(Libro libro) {
    }
    public void calcularLibrocoleccion() {
    }
    public String getNombre() {
        return null;
    }

}