package controlador;
import modelo.Libro;
import modelo.Librocoleccion;
import vista.DialogoAgregarLibro;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Libro Libro;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Libro pLibro)
    {
        this.venPrin = pVenPrin;
        this.Libro = pLibro;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nBibliotecaseñorperez\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("agregarLibro"))
        {
            venPrin.crearDialogoAgregarVendedor();
            this.venPrin.miDialogoAgregarLibro.agregarOyenteBoton(this);
        }

        //Agregar libro
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarLibro.getNombreLibro();
            modelo.Libro.agregarLibro(new Libro(nombre, nombre, null));
            venPrin.miPanelEntradaDatos.setLibro(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado un nuevo libro. \nNombre: " + nombre);
            venPrin.miDialogoAgregarLibro.cerrarDialogoAgregarLibro();
        }
        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}