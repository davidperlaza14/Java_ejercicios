package Java_nivel1;

import java.util.Scanner;

public class Rematepreg {
    /*
     * Pedir número por teclado y preguntar si quiere poner más. Mostrar la suma de los positivos y negativos, suma de los pares e impares, cantidad de positivos y negativos, cantidad de pares e impares y media de todos los números
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumapar = 0, sumaimp = 0, sumapos = 0, sumaneg = 0;
        int contpos = 0, contneg = 0, contpar = 0, contimp = 0;
        int num, contmed = 0;
        float med = 0;
        String respuesta, s, S;
        do {
            System.out.println("Introduce numero: ");
            num = teclado.nextInt();
            med += num;
            contmed ++;
            if ( num < 0 ) {
                System.out.println("El numero es negativo");
                sumaneg += num;
                contneg ++;
            }
            else {
                System.out.println ("El numero es positivo");
                sumapos += num;
                contpos ++;
            }
            if (num % 2 == 0) {
                System.out.println ("El numero es par");
                sumapar += num;
                contpar ++; 
            }
            else {
                System.out.println("El numero es impar");
                sumaimp += num;
                contimp ++;
            }
            System.out.println ("Quiere intoducir otro numero? s/n");
            respuesta = teclado.next();
        } while (respuesta.equals("S") || respuesta.equals("s"));
        // Se pone float para que coja la parte entera y la decimal.
        med = (float)med / contmed;
        System.out.println ("La suma de los negativos es " + sumaneg);
        System.out.println ("La suma de los positivos es " + sumapos);
        System.out.println ("La suma de los pares es " + sumapar);
        System.out.println ("La suma de los impares es " + sumaimp);
        System.out.println ("La cantidad de negativos es " + contneg);
        System.out.println ("La cantidad de positivos es " + contpos);
        System.out.println ("La cantidad de pares es " + contpar);
        System.out.println ("La cantidad de impares es " + contimp);
        System.out.println ("La media de todos los numeros es " + med); 
        
    }
}
