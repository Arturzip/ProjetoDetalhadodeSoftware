interface Produto {
    String getDescricao();
}

class Livro implements Produto {
    public String getDescricao() {
        return "Livro: Sherlock Holmess - Um escandalo na boemia";
    }
}

class Eletronico implements Produto {
    public String getDescricao() {
        return "Eletronico: Smartphone";
    }
}

abstract class ProdutoFactory {
    public abstract Produto criarProduto();
}

class EletronicoFactory extends ProdutoFactory {
    public Produto criarProduto() {
        return new Eletronico();
    }
}


class LivroFactory extends ProdutoFactory {
    public Produto criarProduto() {
        return new Livro();
    }
}
