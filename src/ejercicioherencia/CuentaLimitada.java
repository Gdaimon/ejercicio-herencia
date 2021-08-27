package ejercicioherencia;

public class CuentaLimitada extends Cuenta{
    
    private double limite;

    public CuentaLimitada(double limite, double saldo) {
        super(saldo);
        this.limite = limite;
    }

    public void ajustarLimite(){
        this.limite = getSaldo() / 2;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
    
}
