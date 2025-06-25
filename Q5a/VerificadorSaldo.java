package Q5a;

public class VerificadorSaldo {
    public boolean temSaldo(String usuario, double valor) {
        System.out.println("Verificando saldo para " + usuario + "...");
        return valor <= 1000.0;
    }
}
