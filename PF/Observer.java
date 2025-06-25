import java.util.List;
import java.util.ArrayList;

interface Observador {
    void atualizar();
}

class EmailNotificador implements Observador {
    public void atualizar() {
        System.out.println("Email enviado: Pedido confirmado");
    }
}

class PedidoComObserver extends Pedido {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void confirmarPedido() {
        System.out.println("Pedido confirmado");
        for (Observador o : observadores) {
            o.atualizar();
        }
    }
}
