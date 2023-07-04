package Java_nivel1;

import java.util.Scanner;

public class ArrayBasico {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int datos[], suma=0;
        datos = new int[5];
        int ind;
        // Pide 5 numeros en un bucle
        for (ind = 0; ind < datos.length; ind++) {
            System.out.println("Intoduce dato " + ind + ":");
            datos[ind] = teclado.nextInt();
        }
        for (ind = 0; ind < datos.length; ind++) {
            suma += datos[ind];
            System.out.println("Datos[" + ind + "]=" + datos[ind]);
        }
        System.out.println("La suma es = " + suma);
        System.out.println("Orden inverso");
        // Imprimir los mensajes en un bucle inverso
        for (ind = (datos.length)-1; ind >= 0; ind--) {
            System.out.println("Datos[" + ind + "]=" + datos[ind]);
        }
    }
}



