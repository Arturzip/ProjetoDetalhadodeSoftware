package Q3a;

public class Main {
    public static void main(String[] args) {
        Aplicacao app = new Aplicacao(new DarkThemeFactory());
        app.renderizar();

        app.trocarTema(new LightThemeFactory());
        app.renderizar();

        app.trocarTema(new HighContrastThemeFactory());
        app.renderizar();
    }
}


