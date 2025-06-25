package Q2a;
public abstract class AnaliseDados {

    public final void executarAnalise() {
        carregarDados();
        limparDados();
        processar();
        gerarRelatorio();
    }

    private void carregarDados() {
        System.out.println("Carregando dados..");
    }

    private void limparDados() {
        System.out.println("Limpando dados...");
    }

    protected abstract void processar();

    private void gerarRelatorio() {
        System.out.println("Gerando relatorio.");
    }
}
