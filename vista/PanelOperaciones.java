package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarLibro;
    private JButton btAgregarAutor;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btAgregarLibro = new JButton("Agregar Libro");
        btAgregarLibro.setBounds(10,20,170,20);
        btAgregarLibro.setActionCommand("agregar libro");
        this.add(btAgregarLibro);

        //Crear y agregar boton Agregar autor
        btAgregarAutor = new JButton("Agregar autor");
        btAgregarLibro.setBounds(10,50,170,20); 
        btAgregarAutor.setActionCommand("agregar autor");
        this.add(btAgregarAutor);


        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarLibro.addActionListener(pAL);
        btAgregarAutor.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}