package Q3a;

class BotaoLight implements Botao {
    public void desenhar() {
        System.out.println("Botão claro");
    }
}

class CaixaTextoLight implements CaixaTexto {
    public void desenhar() {
        System.out.println("Caixa de texto clara");
    }
}

class MenuLight implements Menu {
    public void desenhar() {
        System.out.println("Menu claro");
    }
}

class LightThemeFactory implements Factory {
    public Botao criarBotao() {
        return new BotaoLight();
    }
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoLight();
    }
    public Menu criarMenu() {
        return new MenuLight();
    }
}

