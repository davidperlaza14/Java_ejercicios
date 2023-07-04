package java_nivel2;

import java.util.Scanner;

public class Arrais2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int datos[], maximo, buscar, posicion;
        int ind, maior, i, ind_p;
        String resp;
        System.out.println("Introduce cuantos numeros ");
        maximo = teclado.nextInt();
        int pos[] = new int[maximo];
        datos = new int[maximo];
        ind = 0;
        do {
          System.out.println("Introduce dato " + ind);
          datos[ind] = teclado.nextInt();
          ind ++;
          teclado.nextLine();
          System.out.println("Mas numeros?");
          resp = teclado.nextLine();
        } while ((resp.equals("s") || resp.equals("S")) && ind < maximo);
        for (i = 0; i < ind; i ++) {
          System.out.println("Datos[" + i + "]=" + datos[i]);
        }
        System.out.println("Buscamos el mayor");
        maior = datos[ind - 1];
        for (i = ind - 2; i >= 0; i --) {
          if (datos[i] > maior)
            maior = datos[i];
        }
        System.out.println("El mayor es: " + maior);
        System.out.println("Introduce elemento a buscar ");
        buscar = teclado.nextInt();
        posicion = -1;
        ind_p = 0;
        for (i = 0; i < ind; i++) {
          if (datos[i] == buscar) {
            pos[ind_p] = i;
            ind_p++;
          }
        }
        if (ind_p > 0)
          for (i = 0; i < ind_p; i++) {
            System.out.println("La posicion es: " + pos[i]);
          }
        else
          System.out.println("Elemento no encontrado");
      }
}
