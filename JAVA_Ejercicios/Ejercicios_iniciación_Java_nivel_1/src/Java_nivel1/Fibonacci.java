package Java_nivel1;

import java.util.Scanner;

/*
 * Muestra la serie de fibonacci hasta un número pedido por teclado
 */
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, anterior = 0, actual = 1, fibo = 0;
        System.out.println ("Introduce un numero");
        num = teclado.nextInt();
        // Aqui visualizamos 0 e 1, para que comience la serie..
        System.out.println ("0, ");
        System.out.println ("1, ");
        while(fibo <= num) {
            fibo = (anterior + actual);
            anterior = actual;
            actual = fibo;
            System.out.println (fibo + ", ");
        }
    } 
}
