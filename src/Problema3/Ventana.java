/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Kenneth Cedeno
 */
public class Ventana extends JFrame{
    //creacion del panel
    private JPanelDibujo panelDibujo = new JPanelDibujo();
    
    //creacion de la ventana
    public Ventana(String titulo) {
        
        super(titulo);
        // Asignamos un BorderLayout
        this.setLayout(new BorderLayout());
        
        this.add(panelDibujo, BorderLayout.CENTER);
        
        // para que se cierre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // tamano de la ventana
        this.setSize(800,600);
    
        // para que se vea
        this.setVisible(true);
    }
}
