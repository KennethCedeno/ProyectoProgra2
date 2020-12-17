/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    public static void main(String[] args){
        
        Scanner berenjena = new Scanner(System.in);
        
        

        System.out.println("Favor inserte la cantidad de numeros que desee para el primer conjunto de numeros: ");
        int[] arreglo1 = new int[berenjena.nextInt()];
        int cantidadDeN1 = arreglo1.length;
        for(int i = 0; i > cantidadDeN1; i++){
            System.out.println("Favor inserte el numero "+(i+1)+" del conjunto 1: ");
            arreglo1[i] = berenjena.nextInt();
        }
        System.out.println("Favor inserte la cantidad de numeros que desee para el segundo conjunto de numeros: ");
        int[] arreglo2 = new int[berenjena.nextInt()];
        int cantidadDeN2 = arreglo2.length;
        for(int p = 0; p > cantidadDeN1; p++){
            System.out.println("Favor inserte el numero "+(p+1)+" del conjunto 2: ");
            arreglo2[p] = berenjena.nextInt();
        }
        int nFinal = cantidadDeN1 + cantidadDeN2;
        int[] arregloFinal = new int[nFinal];
        
    
        System.arraycopy(arreglo1, 0, arregloFinal, 0, cantidadDeN1);
        System.arraycopy(arreglo2, 0, arregloFinal, cantidadDeN1, cantidadDeN2);

        MetodoParaOrdenar.mergesort(arregloFinal, arregloFinal[0], arregloFinal[nFinal]);
        System.out.println(Arrays.toString(arregloFinal));
    }
}
