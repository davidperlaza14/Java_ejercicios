package Java_nivel1;

import java.util.Scanner;

/*
 * Proponemos un ejercicio para practicar pedir datos por teclado y obtener el resultado del factorial de un número.
 * Calcula el factorial de un número pedido por teclado
 */
public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int fact = 1;
       int num = 0;
       System.out.println("Introduce numero: "); 
       num = teclado.nextInt();
       // Se calcula el factorial
       for (int ind = 1; ind <= num; ind++) {
            fact *= ind;
        }
        // Imprime el resultado
        System.out.println("El factorial es: " + fact);
    }
}
