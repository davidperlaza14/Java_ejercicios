package nivel_3;

import java.util.Scanner;

/**
 * 
 * Un nuevo ejercicio para practicar con arrays de dos dimensiones
 * 
 * Realiza un programa que cree un array de dos dimensiones. Un método que pida números para llenar el array, otro que muestre ordenado por filas, otro que lo muestre ordenado por columnas, otro que busque el número mayor y lo muestre, y por último un método que pida un número y lo guarde en la fila y columna que diga el usuario.
 * 
 * @author David Stiven
 * 
 */
public class Arrays_multidim {
    
    //Insertar numeros en un array bidimensional
    public static void INSERTAR(int[][] num) {
        Scanner teclado  = new Scanner(System.in);

        System.out.println("********************");
        for (int i = 0; i < num.length; i ++) {
            for (int j = 0; j < num[0].length; j ++) {
                System.out.println("Introduce un numero");
                num[i][j] = teclado.nextInt();
            }
        }
        System.out.println("********************");
    }

    //Enseña ordenado por filas
    public static void VER(int[][] num) {
        System.out.println("********************");
        for (int i = 0; i < num.length; i ++) {
            for (int j = 0; j < num[0].length; j ++) {
                System.out.println("Fila: " + i + " - Columna: " + j + "Valor: " + num[i][j]);
            }
        }
        System.out.println("********************");
    }

    // Enseña ordenado por columnas
    public static void VER_COLUMNAS(int[][] num) {
        System.out.println("********************");
        for (int i = 0; i < num.length; i ++) {
            for (int j = 0; j < num.length; j ++) {
                System.out.println("Columna: " + j + " - Fila: " + i + " Valor: " + num[j][i]);
            }
        }
        System.out.println("********************");
    }

    // Buscar elnumero mayor
    public static void BUSCA_MAYOR(int[][] num) {
        int mayor = 0, fila = 0, colum = 0;
        for  (int i = 0; i < num.length; i ++) {
            for (int j = 0; j < num[0].length; j++) {
                if (num[i][j] > mayor) {
                    mayor = num[i][j];
                    fila = i;
                    colum = j;
                }
            }
        }
        System.out.println("********************");
        System.out.println("El mayor es: " + mayor + " en la fila: " + fila + " columna: " + colum);
        System.out.println("********************");
    }

    //Hacer la suma de cada fila y luego la suma total
    public static void SUMAR(int[][] num) {
        int suma, total = 0;
        for (int i = 0; i < num.length; i++) {
            suma = 0;
            for(int j = 0; j < num[0].length; j++) {
                suma = suma + num[i][j];
            }
            System.out.println("Fila: " + i + " suma: " + suma);
            total = total + suma;
        }
        System.out.println("Suma total: " + total);
    }

    //Que el usuario pueda escoger en que fila y columna quiere insertar un dato
    public static void ESCOGE_INSERTA(int[][] num) {
        Scanner teclado = new Scanner(System.in);
        int fila, colum;
        String resp,  basura;

        do {
            System.out.println("Elige la fila");
            fila = teclado.nextInt();
            System.out.println("Elige la columna");
            colum = teclado.nextInt();

            if (fila < num.length) {
                if (colum < num[0].length) {
                    System.out.println("Introduce un valor.");
                    num[fila][colum] = teclado.nextInt();
                }
            }
            System.out.println("Quieres introducir mas valores? (S/N)");
            basura = teclado.nextLine();
            resp = teclado.nextLine();
        } while (resp.equals("s") || resp.equals("S"));

        Arrays_multidim.VER(num);
    }


    public static void main(String[] args) {
        int fila = 2, col = 3;

        int[][] numeros = new int[fila][col];

        Arrays_multidim.INSERTAR(numeros);

        Arrays_multidim.VER(numeros);
        
        Arrays_multidim.VER_COLUMNAS(numeros);

        Arrays_multidim.BUSCA_MAYOR(numeros);

        Arrays_multidim.SUMAR(numeros);

        Arrays_multidim.ESCOGE_INSERTA(numeros);        
    }

}
