package nivel_3;

import java.util.Scanner;

/**
 * 
 * Juego de piedra, papel, tijera. Opción 2
 * 
 * Vamos a empezar con otra versión del juego Piedra, papel o tijera
 * @author David Stiven
 */
class Piedra_papel_tijeras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String jugador_1, jugador_2;

        do {
            System.out.println("Jugador 1 elige una opcion.(P(Papel)/L(Piedra)/T(Tijera))");
            jugador_1 = teclado.nextLine();

            System.out.println("Jugador 2 elige una opcion.(P(Papel)/L(Piedra)/T(Tijera))");
            jugador_2 = teclado.nextLine();
            System.out.println();
        } while (jugador_1.equals(jugador_2));

        if ((jugador_1.equals("P") || jugador_1.equals("p")) && (jugador_2.equals("L") || jugador_2.equals("l"))) {
            System.out.println("*****************************");
            System.out.println("* Jugador_2 gana con papel. *");
            System.out.println("*****************************");
        } else {
            if ((jugador_2.equals("P") || jugador_2.equals("p")) && (jugador_1.equals("L") || jugador_1.equals("l"))) {
                System.out.println("*****************************");
                System.out.println("* Jugador_1 gana con papel. *");
                System.out.println("*****************************");
            } else {
                if ((jugador_1.equals("P") || jugador_1.equals("p"))
                        && (jugador_2.equals("T") || jugador_2.equals("t"))) {
                    System.out.println("******************************");
                    System.out.println("* Jugador_1 gana con piedra. *");
                    System.out.println("******************************");
                } else {
                    if ((jugador_2.equals("P") || jugador_2.equals("p"))
                            && (jugador_1.equals("T") || jugador_1.equals("t"))) {
                        System.out.println("******************************");
                        System.out.println("* Jugador_2 gana con piedra. *");
                        System.out.println("******************************");
                    } else {
                        if ((jugador_1.equals("L") || jugador_1.equals("l"))
                                && (jugador_2.equals("T") || jugador_2.equals("t"))) {
                            System.out.println("*******************************");
                            System.out.println("* Jugador_2 gana con tijeras. *");
                            System.out.println("*******************************");
                        } else {
                            if ((jugador_2.equals("L") || jugador_2.equals("l"))
                                    && (jugador_1.equals("T") || jugador_1.equals("t"))) {
                                System.out.println("*******************************");
                                System.out.println("* Jugador_1 gana con tijeras. *");
                                System.out.println("*******************************");
                            }
                        }
                    }
                }
            }
        }
    }
}