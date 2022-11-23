package modelo;

public class Librocoleccion {


    private String numerocoleccion, nombrecoleccion;

    public Librocoleccion(String numerocoleccion, String nombrecoleccion) {
        this.numerocoleccion = numerocoleccion;
        this.nombrecoleccion = nombrecoleccion;
    }

    public String getNumerocol() {
        return numerocoleccion;
    }

    public void setNumerocol(String numero) {
        this.numerocoleccion = numero;
    }

    public String getNombrecol() {
        return nombrecoleccion;
    }

    public void setNombrecol(String nombre) {
        this.nombrecoleccion = nombre;
    }


    @Override
    public String toString() {
        return "Socio{" + "numero=" + numerocoleccion + ", nombre=" + nombrecoleccion + '}';
    }

    public static void miDialogoAgregarLibroColeccion(Libro libro) {
    }

}

