package Q3a;

class BotaoHighContrast implements Botao {
    public void desenhar() {
        System.out.println("Botaao alto contraste");
    }
}

class CaixaTextoHighContrast implements CaixaTexto {
    public void desenhar() {
        System.out.println("Caixa de texto com alto contraste");
    }
}

class MenuHighContrast implements Menu {
    public void desenhar() {
        System.out.println("Menu com alto contraste");
    }
}

class HighContrastThemeFactory implements Factory {
    public Botao criarBotao() {
        return new BotaoHighContrast();
    }
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoHighContrast();
    }
    public Menu criarMenu() {
        return new MenuHighContrast();
    }
}

