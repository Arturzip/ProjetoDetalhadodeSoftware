package Q5a;

public class CodFront {
    public static void main(String[] args) {
        BancoFacade banco = new BancoFacade();
        banco.transferirDinheiro("tutuzinho", "1234", "ana", 500.0);
    }
}
