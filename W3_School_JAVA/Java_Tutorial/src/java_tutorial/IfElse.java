package java_tutorial;

// Java If ... Else

public class IfElse {
    public static void main(String[] args) {
        // Java Conditions and If Statements

        // Java tiene las siguientes declaraciones condicionales:

     /*  Úselo ifpara especificar un bloque de código que se ejecutará, si una condición especificada es verdadera
        Se usa elsepara especificar un bloque de código a ejecutar, si la misma condición es falsa
        Úselo else ifpara especificar una nueva condición para probar, si la primera condición es falsa
        Úselo switchpara especificar muchos bloques alternativos de código para ejecutar */

        // The if Statement

        // Utilice la ifdeclaración para especificar un bloque de código Java que se ejecutará si una condición es true.
        // Sintaxis
        // if (condition) {
        //     // block of code to be executed if the condition is true
        //   }

        // En el siguiente ejemplo, probamos dos valores para averiguar si 20 es mayor que 18. Si la condición es true, imprime un texto:

        // Ejemplo
        // if (20 > 18) {
        // System.out.println("20 is greater than 18");
        // }

        // También podemos probar variables:

        // Ejemplo
        // int x = 20;
        // int y = 18;
        // if (x > y) {
        // System.out.println("x is greater than y");}

        // Ejemplo explicado
        // En el ejemplo anterior, usamos dos variables, x e y , para probar si x es mayor que y (usando el >operador). Como x es 20 e y es 18, y sabemos que 20 es mayor que 18, imprimimos en pantalla que "x es mayor que y".

        // The else Statement
        // Use the else statement to specify a block of code to be executed if the condition is false.

        // Syntax
        // if (condition) {
        // // block of code to be executed if the condition is true
        // } else {
        // // block of code to be executed if the condition is false
        // }

        // int time = 20;
            // if (time < 18) {
            // System.out.println("Good day.");
            // } else {
            // System.out.println("Good evening.");
            // }  

            // Ejemplo explicado
            // En el ejemplo anterior, el tiempo (20) es mayor que 18, por lo que la condición es false. Debido a esto, pasamos a la elsecondición e imprimimos en la pantalla "Buenas noches". Si el tiempo fuera menor a 18, el programa imprimiría "Buen día".



            // La sentencia else if
            // Utilice la else ifdeclaración para especificar una nueva condición si la primera condición es false.

            // Sintaxis
            // if (condition1) {
            // // block of code to be executed if condition1 is true
            // } else if (condition2) {
            // // block of code to be executed if the condition1 is false and condition2 is true
            // } else {
            // // block of code to be executed if the condition1 is false and condition2 is false
            // }

            // Ejemplo
            // int time = 22;
            // if (time < 10) {
            // System.out.println("Good morning.");
            // } else if (time < 18) {
            // System.out.println("Good day.");
            // } else {
            // System.out.println("Good evening.");
            // }
            // // Outputs "Good evening."

            // Ejemplo explicado
            // En el ejemplo anterior, el tiempo (22) es mayor que 10, por lo que la primera condición es false. La siguiente condición, en la else ifdeclaración, también es false, por lo que pasamos a la else condición, ya que la condición1 y la condición2 son ambas false, e imprimimos en la pantalla "Buenas noches".

            // Sin embargo, si la hora fuera 14, nuestro programa imprimiría "Buen día".

            



















    }
}
