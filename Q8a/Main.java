package Q8a;

public class Main {
    public static void main(String[] args) {
        Forma circulo1 = new Circulo(10, 10);
        Forma quadrado1 = new Quadrado(20, 20);

        GrupoForma subGrupo = new GrupoForma();
        subGrupo.adicionar(new Circulo(5, 5));

        GrupoForma grupoPrincipal = new GrupoForma();
        grupoPrincipal.adicionar(circulo1);
        grupoPrincipal.adicionar(quadrado1);
        grupoPrincipal.adicionar(subGrupo);

        grupoPrincipal.exibir("");
    }
}

