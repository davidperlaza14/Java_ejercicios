package ejercicio_1;

public class CuentaApp2 {
    
    public static void main(String[] args) {
        
        Cuenta2 cuenta_1 = new Cuenta2("David Stiven");
        Cuenta2 cuenta_2 = new Cuenta2("Alis Fernanda");

        cuenta_1.ingresar(1000);
        cuenta_2.ingresar(1000);

        cuenta_1.retirar(200);
        cuenta_2.retirar(100);

        cuenta_1.transferir(300, cuenta_2);

        System.out.println(cuenta_1);
        System.out.println(cuenta_2);




    }
}
