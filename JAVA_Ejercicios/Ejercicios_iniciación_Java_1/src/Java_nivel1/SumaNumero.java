package Java_nivel1;

import java.util.Scanner;

/**
 * Pide dos números por teclado, los suma y muestra el resultado
 */
public class SumaNumero {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1; int num2;
        System.out.println("Introduce un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = teclado.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + resultado);

    }
}
