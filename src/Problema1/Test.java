/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    public static void main(String[] args) {
        Scanner zanahoria = new Scanner(System.in);
        
        int repetir = 0;
        Monedas base = new Monedas("miau", 1);
        Monedas objetivo = new Monedas("guau", 2);
        double cantidad = 0;
        Calculadora azul = new Calculadora(base, objetivo, cantidad);
        while (repetir==0) {
            System.out.println("Inserte el tipo de moneda que desea convertir: (Colon, Dolar o Euro)");
            base.setTipoMoneda(zanahoria.next());
            System.out.println("Inserte el tipo de moneda a la que desea convertir: ");
            objetivo.setTipoMoneda(zanahoria.next());
            System.out.println("Inserte la cantidad que desea convertir:");
            cantidad = zanahoria.nextDouble();
            System.out.println("El resultado de la conversion es: "+ Calculadora.cambio(base,objetivo,cantidad));
            
            
        }
        
    }
}
