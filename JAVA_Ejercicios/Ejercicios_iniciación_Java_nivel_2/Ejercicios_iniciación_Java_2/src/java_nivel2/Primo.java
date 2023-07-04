package java_nivel2;

import java.util.Scanner;

/**
 * 
 * Pide un número por teclado y calcula si es primo o no.
 * 
 * @author David Stiven
 */
public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te dire si es primo o no: \n");

        int num1 = teclado.nextInt();
        if (num1 %3 == 0) {
            System.out.println("El numero: "+ num1 + " Es primo" );
        } else{
            System.out.println("El numero: "+ num1 + "  No es primo");
        }

        
    }
}
