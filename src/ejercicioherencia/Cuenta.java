package ejercicioherencia;

public class Cuenta {
    private double saldo;

    public void ingresar(double cantidad){
        this.saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        this.saldo -= cantidad;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
