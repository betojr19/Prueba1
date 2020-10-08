
/**
 *
 * @author Beto Jr
 */
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;


public class MiVentana {

    public static void main(String[] args) {
        JFrame f = new JFrame("Mi otra ventana");
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Aceptar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }

    private static Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
