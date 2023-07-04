package java_nivel2;

import java.util.Scanner;

public class Arrais1 {
    
    /**
     * Pide 5 números por teclado, los suma y los guarda en un array, 
     * luego imprime por pantalla la suma y los números en orden inverso
     * @param args
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int datos[], suma = 0;
       datos = new int[5];
       int ind;

       for (ind = 0; ind < datos.length; ind ++) {
        System.out.println("Introduce dato " + ind);
        datos[ind] = teclado.nextInt();
       }

       for (ind = 0; ind < datos.length; ind++) {
        suma += datos[ind];
        System.out.println("Datos[" + ind + "]=" + datos[ind]);
       }
       System.out.println("La suma es = " + suma);
       System.out.println("Orden inverso");
       for (ind = (datos.length) - 1; ind >= 0; ind --){
        System.out.println("Datos[" + ind + "]=" + datos[ind]);
       }
        
    }
}
