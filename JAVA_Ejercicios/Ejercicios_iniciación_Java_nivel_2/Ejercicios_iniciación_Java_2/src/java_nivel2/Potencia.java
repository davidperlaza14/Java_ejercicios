package java_nivel2;

import java.util.Scanner;

/**
 * 
 * Pide 2 números por teclado y calcula la potencia del primero elevado al segundo, pero sin utilizar multiplicación ni otros métodos.
 * 
 * @author David Stiven
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // System.out.println("Calcular la Potencia de nuemros.\n");
        // System.out.println();
        // System.out.println("Introduce un numero: ");
        // double num1 = teclado.nextInt();
        // System.out.println("Introduce el segundo numero: ");
        // double num2 = teclado.nextInt();

        // double potencia = Math.pow(num1, num2);
        // System.out.println("La potencia de  "+ num1 + "  es: " + potencia);


        int num2, num1, prod;
        int i, j, auxprod;
        System.out.println("numero 1?");
        num1 = teclado.nextInt();
        System.out.println("numero 2?");
        num2 = teclado.nextInt();
        prod = num1;
        for (i = 1; i < num2; i ++) {
        auxprod = prod;
        for (j = 1; j < num1; j ++) {
            prod += auxprod;
        }
        }
        System.out.println("potencia " + prod);


        
    }
}
