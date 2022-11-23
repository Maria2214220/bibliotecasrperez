package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {

        VentanaPrincipal miVentana = new VentanaPrincipal();
        Libro miLibro = new Libro(null, null, null);
        Controlador miControlador = new Controlador(miVentana, miLibro);
    }    
}