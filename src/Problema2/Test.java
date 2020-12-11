/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    public static void main(String[] args) {
        Scanner zanahoria = new Scanner(System.in);
        
        String nombreNuevo;
        int valorNuevo;
        int tipo = 0;
        int repetir = 0;
        Moneda base = new Moneda("miau", 1);
        Moneda objetivo = new Moneda("guau", 2);
        double cantidad = 0;
        Calculadoraa azul = new Calculadoraa(base, objetivo, cantidad);
        while (repetir==0) {
            System.out.println("Inserte el numero del tipo de moneda que desea convertir: (1=Colon, 2=Dolar, 3=Euro, 4=Otro)");
            tipo = zanahoria.nextInt();
            if (tipo == 1) {
                base.setTipoMonedas("Colon");
            } else if (tipo == 2) {
                base.setTipoMonedas("Dolar");
            } else if (tipo == 3) {
                base.setTipoMonedas("Euro");
            } else if (tipo == 4) {
                base.setTipoMonedas("Otro");
                
            }
            System.out.println("Inserte el tipo de moneda a la que desea convertir: (Colon, Dolar, Euro, Otro) ");
            objetivo.setTipoMonedas(zanahoria.next());
            System.out.println("Inserte la cantidad que desea convertir:");
            cantidad = zanahoria.nextDouble();
            System.out.println("El resultado de la conversion es: "+ Calculadoraa.cambio(base,objetivo,cantidad));
            
            
        }
    }
}