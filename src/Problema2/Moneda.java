/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

/**
 *
 * @author Kenneth Cedeno
 */
public class Moneda {
    String tipoMonedas;
    double cantidad;

    public Moneda(String tipoMoneda, double cantidad) {
        this.tipoMonedas = tipoMoneda;
        this.cantidad = cantidad;
    }

    public String getTipoMonedas() {
        return tipoMonedas;
    }

    public void setTipoMonedas(String tipoMonedas) {
        this.tipoMonedas = tipoMonedas;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
