package Problema2;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Calculadoraa {
    
    static Scanner manzana = new Scanner(System.in);
    Moneda base = new Moneda("vacio", 0);
    Moneda objetivo = new Moneda("nel", 0);
    double cantidadAConvertir = 0;
    static double otro = 0;
    
    public Calculadoraa(Moneda base, Moneda objetivo, double cantidadAConvertir) {
        this.base = base;
        this.objetivo = objetivo;
        this.cantidadAConvertir = cantidadAConvertir;
    }

    public static double cambio(Moneda base, Moneda objetivo, double cantidadAConvertir) {
        double resultadoDeLaConversion = 0;

        if (base.getTipoMonedas().equals("Colon")) {
            if (objetivo.getTipoMonedas().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            } else if (objetivo.getTipoMonedas().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir / 500;

            } else if (objetivo.getTipoMonedas().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir / 765;

            } else if (objetivo.getTipoMonedas().equals("Otro")) {
                System.out.println("Inserte el valor del Colon con respecto a la otra moneda: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;
            }
            
        } else if (base.getTipoMonedas().equals("Dolar")) {
            if (objetivo.getTipoMonedas().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir * 500;

            } else if (objetivo.getTipoMonedas().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            } else if (objetivo.getTipoMonedas().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir / 1.53;

            } else if (objetivo.getTipoMonedas().equals("Otro")) {
                System.out.println("Inserte el valor del Dolar con respecto a la otra moneda: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;
            }
            
        } else if (base.getTipoMonedas().equals("Euro")) {
            if (objetivo.getTipoMonedas().equals("Colon")) {
                resultadoDeLaConversion = cantidadAConvertir * 765;

            } else if (objetivo.getTipoMonedas().equals("Dolar")) {
                resultadoDeLaConversion = cantidadAConvertir * 1.53;
                        

            } else if (objetivo.getTipoMonedas().equals("Euro")) {
                resultadoDeLaConversion = cantidadAConvertir;
                
            } else if (objetivo.getTipoMonedas().equals("Otro")) {
                System.out.println("Inserte el valor del Euro con respecto a la otra moneda: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;
            }
        } 
        else if(base.getTipoMonedas().equals("Otro")) {
            if (objetivo.getTipoMonedas().equals("Colon")) {
                System.out.println("Inserte el valor de la moneda con respecto al Colon Costarricense: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;

            } else if (objetivo.getTipoMonedas().equals("Dolar")) {
                System.out.println("Inserte el valor de la moneda con respecto al Dolar: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;
                        

            } else if (objetivo.getTipoMonedas().equals("Euro")) {
                System.out.println("Inserte el valor de la moneda con respecto al Euro: ");
                otro = manzana.nextDouble();
                resultadoDeLaConversion = cantidadAConvertir * otro;
                
            } else {
                resultadoDeLaConversion = cantidadAConvertir;
            }
        }

        return resultadoDeLaConversion;
    }

}
