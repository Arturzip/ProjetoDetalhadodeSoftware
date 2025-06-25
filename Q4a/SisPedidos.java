package Q4a;

interface Pedido {
    double getCusto();
    String getDescricao();
}

class PedidoSimples implements Pedido {
    public double getCusto() {
        return 100.0;
    }

    public String getDescricao() {
        return "Pedido simples";
    }
}

abstract class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getCusto() {
        return pedido.getCusto();
    }

    public String getDescricao() {
        return pedido.getDescricao();
    }
}

class EmbalagemPresente extends PedidoDecorator {
    public EmbalagemPresente(Pedido pedido) {
        super(pedido);
    }

    public double getCusto() {
        return super.getCusto() + 10.0;
    }

    public String getDescricao() {
        return super.getDescricao() + " + embalagem para presente";
    }
}

class FreteExpresso extends PedidoDecorator {
    public FreteExpresso(Pedido pedido) {
        super(pedido);
    }

    public double getCusto() {
        return super.getCusto() + 30.0;
    }

    public String getDescricao() {
        return super.getDescricao() + " + frete expresso";
    }
}

class SeguroPedido extends PedidoDecorator {
    public SeguroPedido(Pedido pedido) {
        super(pedido);
    }

    public double getCusto() {
        return super.getCusto() + 20.0;
    }

    public String getDescricao() {
        return super.getDescricao() + " + seguro";
    }
}

