/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogridbag;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Gamero
 */
public class EjemploGridBag extends JFrame{

    JLabel name, address, items;
    JTextArea addA, itemA, area52, area54;
    JTextField fieldNombre;
    
    public EjemploGridBag(String title) throws HeadlessException {
        super(title);
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new GridBagLayout());
        
        gbc.insets = new Insets(5, 5, 5, 5);
        //Etiquetas nombre y direccion
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weightx = 0.4;
        gbc.fill = GridBagConstraints.BOTH;
        name = new JLabel("Name");
        add(name, gbc);
        
        
        //Etiqueta Item
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.weightx = 0.2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        items = new JLabel("Items ");
        add(items, gbc);
        
        //TextFiel nombre
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.weightx = 0.4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        fieldNombre = new JTextField();
        add(fieldNombre, gbc);
        
        //AreaItems
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.weightx = 0.6;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = GridBagConstraints.RELATIVE;
        itemA = new JTextArea();
        add(itemA, gbc);
        
        //Ultimo area de texto
        gbc.gridx=3;
        gbc.gridy=5;
        gbc.weightx = 0.2;
        gbc.weighty = 0.17;
        gbc.fill = GridBagConstraints.BOTH;
        area54 = new JTextArea(2,7);
        add(area54, gbc);
        
        
    }

    
    public static void main(String[] args) {
        JFrame pantalla = new EjemploGridBag("Diseño GBL ");
        pantalla.pack();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
