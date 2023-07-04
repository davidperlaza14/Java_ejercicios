package Java_nivel1;

import java.util.Scanner;

/*
 * Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
 * @author David Stiven
 *  */
public class MayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1; int num2;
        System.out.println("Introduce un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = teclado.nextInt();
        if (num1 == num2) {
            System.out.println("Son iguales");
        }
        else if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }

    }
    
}
