package Java_nivel1;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean primo = true;
        int num;
        String respuesta, s, S;
        do {
            System.out.println("Introduce numero");
            num = teclado.nextInt();
            for(int ind = 2; ind < num; ind++){
                if(num%ind == 0){
                    primo = false;
                }
            }
            if (primo == true) {
                System.out.println(num + " es primo");
            }
            else{
                System.out.println(num + " no es primo");
            }System.out.println("Quieres introducir otro numero? s/n ");
            respuesta = teclado.next();
        } while (respuesta.equals("S") || respuesta.equals("s"));
    }
}
