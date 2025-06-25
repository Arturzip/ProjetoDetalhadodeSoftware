class Pedido {
    public String getDescricao() {
        return "Pedido basico";
    }
}

abstract class PedidoDecorator extends Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }
}

class EmbalagemPresente extends PedidoDecorator {
    public EmbalagemPresente(Pedido pedido) {
        super(pedido);
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + embalagem para presente";
    }
}
