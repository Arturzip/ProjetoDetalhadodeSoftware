package Q5a;

public class Autenticador {
    public boolean autenticar(String usuario, String senha) {
        System.out.println("Autenticando usuario...");
        return usuario.equals("tutuzinho") && senha.equals("1234");
    }
}
