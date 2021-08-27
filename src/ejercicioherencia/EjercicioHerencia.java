package ejercicioherencia;

public class EjercicioHerencia {


    public static void main(String[] args) {
        CuentaLimitada climitada = new CuentaLimitada(70, 100);
        climitada.retirar(90);
        System.out.println(climitada.getSaldo());
    }
    
}
