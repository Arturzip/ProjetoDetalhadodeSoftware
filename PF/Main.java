public class Main {
    public static void main(String args[]) {
        ProdutoFactory factory = new LivroFactory();
        ProdutoFactory elet = new EletronicoFactory();

        Produto produto = factory.criarProduto();
        Produto produto2 = elet.criarProduto();

        System.out.println(produto.getDescricao());
        System.out.println(produto2.getDescricao());

        Pedido pedido = new Pedido();
        pedido = new EmbalagemPresente(pedido);

        System.out.println(pedido.getDescricao());

        PedidoComObserver pedidoFinal = new PedidoComObserver();
        pedidoFinal.adicionarObservador(new EmailNotificador());
        pedidoFinal.confirmarPedido();

    }
}
