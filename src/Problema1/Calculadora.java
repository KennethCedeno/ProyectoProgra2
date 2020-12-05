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
public class Calculadora {

    Monedas base = new Monedas("vacio", 0);
    Monedas objetivo = new Monedas("nel", 0);
    double cantidadAConvertir = 0;

    public Calculadora(Monedas base, Monedas objetivo, double cantidadAConvertir) {
        this.base = base;
        this.objetivo = objetivo;
        this.cantidadAConvertir = cantidadAConvertir;
    }

    public static double cambio(Monedas base, Monedas objetivo, double cantidadAConvertir) {
        double resultadoDeLaConversion = 0;

        if (base.getTipoMoneda().equals("Colon")) {
            if (objetivo.getTipoMoneda().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            } else if (objetivo.getTipoMoneda().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir / 500;

            } else if (objetivo.getTipoMoneda().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir / 765;

            }
        } else if (base.getTipoMoneda().equals("Dolar")) {
            if (objetivo.getTipoMoneda().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir * 500;

            } else if (objetivo.getTipoMoneda().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            } else if (objetivo.getTipoMoneda().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir / 1.53;

            }
        } else if (base.getTipoMoneda().equals("Euro")) {
            if (objetivo.getTipoMoneda().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir * 765;

            } else if (objetivo.getTipoMoneda().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir * 1.53;
                        

            } else if (objetivo.getTipoMoneda().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            }
        }

        return resultadoDeLaConversion;
    }

}
