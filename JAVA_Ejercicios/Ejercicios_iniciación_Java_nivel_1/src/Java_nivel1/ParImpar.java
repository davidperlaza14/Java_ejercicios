package Java_nivel1;

import java.util.Scanner;

/*
 * Pide un número y muestra si es positivo o negativo y si es par o impar
 */
public class ParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo\n");
        }
        else {
            System.out.println("El numero " + numero + " es positivo");
        } if (numero %2 == 0) {
            System.out.println("El numero " + numero + " es par\n" );
            
        }
        else {
            System.out.println("El numero " + numero + " es impar\n");
        }

    }
    
}
