package Q3a;

public class Aplicacao {
    private Factory factory;
    private Botao botao;
    private CaixaTexto caixaTexto;
    private Menu menu;

    public Aplicacao(Factory factory) {
        this.factory = factory;
        criarComponentes();
    }

    private void criarComponentes() {
        botao = factory.criarBotao();
        caixaTexto = factory.criarCaixaTexto();
        menu = factory.criarMenu();
    }

    public void renderizar() {
        botao.desenhar();
        caixaTexto.desenhar();
        menu.desenhar();
    }

    public void trocarTema(Factory novaFactory) {
        this.factory = novaFactory;
        criarComponentes();
        System.out.println("Tema alteradoo\n");
    }
}
