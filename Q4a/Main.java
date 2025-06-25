package Q4a;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoSimples();

        pedido = new EmbalagemPresente(pedido);
        pedido = new FreteExpresso(pedido);
        pedido = new SeguroPedido(pedido);

        System.out.println("Descricao: " + pedido.getDescricao());
        System.out.println("Custo total: R$" + pedido.getCusto());
    }
}

