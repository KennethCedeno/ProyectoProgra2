/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth Cedeno
 */
public class Reporte {
    boolean modoGrafico = true;
    
    public void imprimir(){
        String mensajePrueba = "Prueba";
        if (modoGrafico){
            JOptionPane.showMessageDialog(null, mensajePrueba);
        } else {
            System.out.println(mensajePrueba);
        }
    }
}
