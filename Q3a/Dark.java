package Q3a;

class BotaoDark implements Botao {
    public void desenhar() {
        System.out.println("Botao escuro");
    }
}

class CaixaTextoDark implements CaixaTexto {
    public void desenhar() {
        System.out.println("Caixa de texto escura");
    }
}

class MenuDark implements Menu {
    public void desenhar() {
        System.out.println("Menu escuro");
    }
}

class DarkThemeFactory implements Factory {
    public Botao criarBotao() {
        return new BotaoDark();
    }
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoDark();
    }
    public Menu criarMenu() {
        return new MenuDark();
    }
}

