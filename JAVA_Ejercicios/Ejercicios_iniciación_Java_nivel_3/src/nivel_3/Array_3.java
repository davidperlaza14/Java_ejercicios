package nivel_3;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que guarde datos de una persona: nombre, edad y salario. Sin utilizar objetos.
 * 
 * Luego buscar por el nombre y mostrar edad y salario
 * 
 * Guardar nombre, edad y salario sin usar objetos
 * 
 * @author David Stiven
 */
public class Array_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tam, i = 0;
        String basura, resp;
        System.out.println("Introduce el tamaño maximo");
        tam = teclado.nextInt();
        String nombre[] = new String[tam];
        int edad[] = new int[tam];
        float salario[] = new float[tam];
        System.out.println("Quieres introducir un dato? S/N");
        basura = teclado.nextLine();
        resp = teclado.nextLine();
        System.out.println();
        while ((resp.equals("s") || resp.equals("S")) && i < tam) {
            System.out.println("introduce un nombre.");
            nombre[i] = teclado.nextLine();
            System.out.println("introduce una edad.");
            edad[i] = teclado.nextInt();
            System.out.println("introduce un salario.");
            salario[i] = teclado.nextFloat();
            i++;
            if (i == tam) {
                System.out.println("El array ya esta lleno.");
            } else {
                System.out.println("Quieres introducir otro dato? S/N");
                basura = teclado.nextLine();
                resp = teclado.nextLine();
                System.out.println();
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println("En la posicion " + j + " nombre: " + nombre[j] + ", edad: " + edad[j] + ", salario: "
                    + salario[j]);
        }
        //Buscar por el nombre y mostrar la edad y el salario
        String nom;
        boolean semaforo = false;
        System.out.println();
        System.out.println("introduce el nombre a buscar.");
        nom = teclado.nextLine();
        for (int j = 0; j < i; j++) {
            if (nombre[j].equals(nom)) {
                System.out.println("Los datos de " + nom + " son: edad " + edad[j] + " salario " + salario[j]);
                semaforo = true;
            }
        }
        if (semaforo == false) {
            System.out.println("Ese nombre no se encuentra en el array.");
        }
    }
}
