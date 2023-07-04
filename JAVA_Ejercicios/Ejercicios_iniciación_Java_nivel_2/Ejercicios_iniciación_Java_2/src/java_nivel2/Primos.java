package java_nivel2;

import java.util.Scanner;

/**
 * Pide por teclado un intervalo entre 2 números. Luego imprime por pantalla todo el intervalo diciendo los que son primos y los que no.
 * 
 */
public class Primos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, num1, num2, div;
        boolean primo = true;
        do {
            System.out.println("numero1?");
            num1 = teclado.nextInt();
            System.out.println("numero 2? Mayor que numero 1 ");
            num2 = teclado.nextInt();
        } while (num1 > num2);
        for (num = num1; num <= num2; num ++) {
            primo = true;
            for (div = 2; div < num; div ++) {
                if (num % div == 0)
                    primo = false;
            }
            if (primo)
                System.out.println("numero " + num + " primo");
            else
                System.out.println("numero " + num + " no es primo");
        }

    
}
}
