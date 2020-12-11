package Problema4;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    
    public static boolean buscarNumero(int[] arreglo, int numero) {
  return Arrays.asList(arreglo)
    .contains(numero);
   }
    
    
    public static void main(String[] args) {
        Scanner lex = new Scanner(System.in);
        int n = 0;
        int ask = 0;
        int busca = 0;
        System.out.println("Inserte la cantidad de numeros que desea tener en el arreglo: ");
        n = lex.nextInt();
        
        int[] lista = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("Insertar el numero "+(i+1)+": " );
            lista[i] = lex.nextInt();
        }
        Arrays.asList(lista);
        System.out.println("Desea buscar un numero en la lista? (1=si 2=no)");
        ask = lex.nextInt();
        
        if(ask == 1) {
            System.out.println("Inserte el numero que desea buscar: ");
            busca = lex.nextInt();
            if (buscarNumero(lista, busca)) {
                System.out.println("El numero "+busca+"esta en la lista.");
            } else {
                System.out.println("El numero "+busca+" no esta en la lista.");
            }
        }
    }
   
}
