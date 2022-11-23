package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------

    private JLabel lbAgregarLibro;
    private JTextField tfAgregarLibro;

    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        
        //Creación y adición
        lbAgregarLibro = new JLabel("Agregar libro = ");
        lbAgregarLibro.setBounds(0,90,100,20);
        add(lbAgregarLibro);
        
        
        //Creación y adición de campos de texto
        tfAgregarLibro = new JTextField("");
        tfAgregarLibro.setBounds(100, 90, 260, 20);
        add(tfAgregarLibro);
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getAgregarLibro()
    {
        return tfAgregarLibro.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfAgregarLibro.setText("");
    }

    public void setLibro(String nombre) {
    }
}