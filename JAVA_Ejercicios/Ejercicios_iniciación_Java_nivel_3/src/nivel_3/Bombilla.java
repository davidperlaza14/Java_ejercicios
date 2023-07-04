package nivel_3;

import java.util.Scanner;

/**
 * Crea una clase Bombilla y un programa que cree objetos Bombilla y utilice todas las propiedades y métodos.
 * 
 * Propiedades
 * 1. estado: si está apagada o encendida (boolean). Por defecto false
 * 2. potencia: en vatios (int)
 * 3. color: color de la bombilla (String)
 * 4. horas: horas que puede estar encendida (float). Por defecto 10
 * 
 * 
 * Métodos
 * 
 * 1. encender: si quedan horas enciende la bombilla, pone la propiedad estado = true y pide por teclado cuánto tiempo estará encendida. Resta el tiempo de la propiedad horas.
 * 2. apagar: pone la propiedad estado = false
 * 3. ver_estado: devuelve el estado de la bombilla
 * 4. cambia_potencia: se le pasa una potencia por parámetro y la sustituye por lo que hay en la propiedad potencia
 * 5. ver_potencia: devuelve la potencia de la bombilla
 * 6. cambia_color: se le pasa el color por parámetro y si la bombilla está encendida la apaga y luego cambia el color.
 * 7. ver_color: imprime por pantalla el color de la bombilla
 * 8. recargar: pregunta cuántas horas quiere el usuario recargar y las suma a la propiedad horas
 * 
 * @author David Stiven
*/
class Bombilla {
    boolean estado;
    float potencia;
    String color;
    float horas = 10;
    
    public void encender() {
        float tiempo;
        Scanner teclado = new Scanner(System.in);
        
        if(horas > 0) {
            estado = true;
            System.out.println("La bombilla esta encendida\n");
            System.out.println("Quedan "+horas+" horas de uso\n");
        
            System.out.println("Cuantas horas va a estar encendida la bombilla?\n");
            tiempo = teclado.nextFloat();
        
            if(horas >= tiempo) {    
                horas=horas-tiempo;
                System.out.println("La bombilla estara encendida " + tiempo + " horas\n");
                System.out.println("Ahora quedan " + horas + " horas de uso\n");
        
            }
            else
                System.out.println("Se ha pasado del limite de horas, la bombilla no se encendera\n");
        }
        else
            System.out.println("La bombilla no se puede encender, recargue horas. Opcion 8\n");
    }
    
    public void apagar() {
        estado = false;
        System.out.println("La bombilla esta apagada\n");
    }
    
    public boolean ver_estado() {
        return estado;
    }
    
    public void cambia_potencia(float pot) {
        potencia = pot;
    }
    
    public float ver_potencia() {
        return potencia;
    }
    
    public void cambia_color(String cor) {
        if(estado)
            apagar();  // estado = false;
        color = cor;
    }
    
    public void ver_color() {
        System.out.println("El color es \n"+color);
    }
    
    public void RECARGAR() {
        float recarga;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas horas quiere recargar?\n");
        recarga = teclado.nextFloat();
        horas=horas+recarga;
        System.out.println("Ahora quedan " + horas + " horas de uso\n");
    }    
}
