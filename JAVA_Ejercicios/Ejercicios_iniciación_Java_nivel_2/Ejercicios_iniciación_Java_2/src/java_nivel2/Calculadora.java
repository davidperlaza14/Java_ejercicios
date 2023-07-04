package java_nivel2;

import java.util.Scanner;

/**
 * Un nuevo ejercicio para simular una calculadora
 * Aplicación de calculadora que muestre un menú con las opciones sumar, restar, multiplicar, dividir y salir. Cada opción será un método diferente:
 * 
 * Suma: se le pasan los números e imprime el resultado de la suma.
 * 
 * Resta: se le pasan los números y devuelve el resultado de la resta
 * 
 * Multiplicación: pide los números por teclado y devuelve el resultado de la multiplicación
 * 
 * División: pide los números por teclado e imprime el resultado de la división
 * 
 * @author David Stiven
 */
public class Calculadora {
    public static void SUMA(int num1, int num2){
        System.out.println("La suma es: " + (num1 + num2));
    }
    public static int RESTA(int num1, int num2) {
        return num1 - num2;
    }
    public static int  MULTI() {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce Num1 ");
        num1 = teclado.nextInt();
        System.out.println("Introduce num2 ");
        num2 = teclado.nextInt();
        return num1 * num2;


    }
    public static void DIV() {
        int num1, num2, div;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero 1 ");
        num1 = teclado.nextInt();
        do {
            System.out.println("Introduce numero 2 distinto de 0 ");
            num2 = teclado.nextInt();
        } while (num2 == 0);
        div = num1 / num2;
        System.out.println("La división es: " + div);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, opción, result;
        do {
            System.out.println("1-SUMAR ");
            System.out.println("2-RESTAR ");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR ");
            System.out.println("0-SALIR");
            System.out.println("Introduce opcion ");
            opción = teclado.nextInt();

            if (opción == 1) {
                System.out.println("Introduce numero 1 ");
                num1 = teclado.nextInt();
                System.out.println("Introduce numero 2 ");
                num2 = teclado.nextInt();
                SUMA(num1, num2);
            }

            if (opción == 2) {
                System.out.println("Introduce numero 1 ");
                num1 = teclado.nextInt();
                System.out.println("Introduce numero 2 ");
                num2 = teclado.nextInt();
                RESTA(num1, num2);
                System.out.println("lA resta es: " + RESTA(num1, num2));               
            }

            if (opción == 3) {
                result = MULTI();
                System.out.println("El producto es: "+ result);
                
            }

            if (opción == 4) {
                DIV();
            }
            
        } while (opción != 0);
    }

}
