package Q5a;

public class BancoFacade {
    private Autenticador autenticador = new Autenticador();
    private VerificadorSaldo verificador = new VerificadorSaldo();
    private CalculadoraTaxas calculadora = new CalculadoraTaxas();
    private ExecutorTransferencia executor = new ExecutorTransferencia();

    public void transferirDinheiro(String usuario, String senha, String destino, double valor) {
        if (!autenticador.autenticar(usuario, senha)) {
            System.out.println("Autenticaçao deu errado pae");
            return;
        }

        if (!verificador.temSaldo(usuario, valor)) {
            System.out.println("Sem saldo");
            return;
        }

        double taxa = calculadora.calcularTaxa(valor);
        double valorFinal = valor - taxa;

        executor.transferir(usuario, destino, valorFinal);
        System.out.println("Transferencia concluida com taxa de R$" + taxa);
    }
}

