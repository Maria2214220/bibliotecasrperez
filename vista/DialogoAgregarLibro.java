package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarLibro extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreLibro;
    private JTextField tfNombreLibro;
    private JButton btAgregarLibro;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarLibro()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreLibro = new JLabel("Libro: ");
        lbNombreLibro.setBounds(10,50,140,20);
        this.add(lbNombreLibro);

        tfNombreLibro = new JTextField();
        tfNombreLibro.setBounds(100,90,260, 20);
        this.add(tfNombreLibro);

        btAgregarLibro = new JButton("Agregar");
        btAgregarLibro.setBounds(20,140,260,25);
        btAgregarLibro.setActionCommand("agregar");
        this.add(btAgregarLibro);

        //Caracteristicas de la ventana
        this.setTitle("Agregar");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreLibro()
    {
        return tfNombreLibro.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarLibro.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }

    public void cerrarDialogoAgregarLibro() {
    }
} 

