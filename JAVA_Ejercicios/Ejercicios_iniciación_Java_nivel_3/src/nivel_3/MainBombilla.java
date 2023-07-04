package nivel_3;

import java.util.Scanner;

public class MainBombilla {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean onoff;
        float pot = 0, potencia;
        String color;
        Bombilla objeto = new Bombilla();

        do {
            System.out.println("1-ENCENDER ");
            System.out.println("2-APAGAR ");
            System.out.println("3-VER ESTADO ");
            System.out.println("4-CAMBIAR POTENCIA ");
            System.out.println("5-VER POTENCIA ");
            System.out.println("6-CAMBIA COLOR ");
            System.out.println("7-VER COR ");
            System.out.println("8-RECARGAR ");
            System.out.println("0-SALIR ");
            System.out.println(" Introduce opcion ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                objeto.encender();                    
                break;

                case 2:
                objeto.apagar();
                break;

                case 3:
                onoff = objeto.ver_estado();
                if (onoff) 
                    System.out.println("La bombilla esta encendida\n");
                else 
                    System.out.println("La bombilla esta apagada\n");               
                break;

                case 4:
                System.out.println("Introduce nueva potencia \n");
                pot = teclado.nextFloat();
                objeto.cambia_potencia(pot);                    
                break;

                case 5:
                potencia = objeto.ver_potencia();
                System.out.println("La potencia es \n" + potencia);
                break;

                case 6:
                System.out.println("Introduce nuevo color\n");
                color = teclado.next();
                objeto.cambia_color(color);
                break;

                case 7:
                objeto.ver_color();
                break;

                case 8:
                objeto.RECARGAR();                  
                break;

                case 0:
                System.out.println("Adios");                
                break;

                
                default:
                System.out.println("Error. Introduce un valor del menu.");
                break;
            }

        } while (opcion != 0);
    }
    
}
