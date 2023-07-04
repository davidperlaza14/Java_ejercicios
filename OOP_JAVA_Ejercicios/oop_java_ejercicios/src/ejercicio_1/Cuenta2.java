package ejercicio_1;

public class Cuenta2 {
    private String titular;
    private double cantidad;

    private static int total = 0;
    

    // Constructor
    public Cuenta2(String titular) {
        this(titular, 0); //Sobrecarga
    }

    public Cuenta2(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    // Metodos

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Ingresa dinero a la cuenta,
     * solo si es positivo la cantidad
     * 
     * @param Cantidad
     */

     public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
     }

     /**
     * Retira una cantidad en la cuenta,
     * si se quedara en negativo se quedaria en cero 0
     * 
     * @param cantidad
     */

     public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;

        } else {
            this.cantidad -= cantidad;
        }
     }

     
     public boolean transferir(double valor, Cuenta2 cuenta2) {
        total++;
        if (this.cantidad >= cantidad) {
            this.cantidad = valor;
            cuenta2.ingresar(valor);
            return true;
        }
        
        return false;
     }

    
     /**
     * Devuelve el estado del objeto
     *
     *@return
     *  
     */
     public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta" 
        + "  \nEl numero de transferencia fue " + total; 
        
     }


}
