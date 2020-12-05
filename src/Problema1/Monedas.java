/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

/**
 *
 * @author Kenneth Cedeno
 */
public class Monedas {
    String tipoMoneda;
    double cantidad;

    public Monedas(String tipoMoneda, double cantidad) {
        this.tipoMoneda = tipoMoneda;
        this.cantidad = cantidad;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
            
}
