package Java_nivel1;

import java.util.Scanner;

/*
 * Pide por teclado el nombre, edad y salario y muestra el salario
 *  Si es menor de 16 no tiene edad para trabajar
 * Entre 19 y 50 años el salario es un 5 por ciento más
 * Entre 51 y 60 años el salario es un 10 por ciento más
 * Si es mayor de 60 el salario es un 15 por ciento más
 * 
 */

public class Edad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        double salario;


        System.out.println("Cual es tu nombre");
        nombre = teclado.next();
        System.out.println();
        System.out.println("Hola, " + nombre + " Espero te encuentres bien.");
        System.out.println();
        System.out.println("Cual es tu edad");
        edad = teclado.nextInt();
        System.out.println();
        System.out.println("Cual es tu salario");
        salario = teclado.nextDouble();

        Double incremento1 = ((salario * 5) / 100) + salario;
        Double incremento2 = ((salario * 10) / 100) + salario;
        Double incremento3 = ((salario * 15) / 100) + salario;

        

        if (edad < 16) {
            System.out.println( "Tu esdad es: " + edad + " Eres menor de 16 no tiene edad para trabajar");
            
        } 
        
        if (edad >= 19 && edad <= 50) {
            System.out.println("Tu salario es: " + salario + " Mas un 5% de incremento queda en: " + incremento1 );            
        }
        if (edad >= 51 && edad < 60) {
            System.out.println("Tu salario es: " + salario + " Mas un 5% de incremento queda en: " + incremento2 );            
        }
        if (edad >= 60) {
            System.out.println("Tu salario es: " + salario + " Mas un 5% de incremento queda en: " + incremento3 );            
        }

        System.out.println("Adios " + nombre);




    // Scanner teclado = new Scanner(System.in);
    //     String nombre;
    //     int edad;
    //     float salario, salar;
    //     System.out.println ("introduce un nombre: ");
    //     nombre = teclado.nextLine();
    //     System.out.println();
    //     System.out.println ("introduce una edad: ");
    //     edad = teclado.nextInt();
    //     System.out.println();
    //     System.out.println ("introduce un salario: ");
    //     salario = teclado.nextFloat();
    //     System.out.println();
    //     if(edad >= 16 && edad <= 18) {
    //         salar = salario;
    //         System.out.println(nombre + " con " + edad + " años cobra " + salario + " + 0% = " + salar);
    //     }
    //     else if(edad >= 19 && edad <= 50) {
    //         salar = salario + ((salario * 5)/100);
    //         System.out.println(nombre + " con " + edad + " años cobra " + salario + " + 5% = " + salar);
    //     }
    //     else if(edad >= 51 && edad <= 60) {
    //         salar = salario + ((salario * 10)/100);
    //         System.out.println(nombre + " con " + edad + " años cobra " + salario + " + 10% = " + salar);
    //     }
    //     else if(edad > 60) {
    //         salar = salario + ((salario * 15)/100);
    //         System.out.println(nombre + " con " + edad + " años cobra " + salario + " + 15% = " + salar);
    //     }
    //     else if(edad < 16) {
    //         System.out.println("No tienes edad para trabajar");
    //     }

    }




}
