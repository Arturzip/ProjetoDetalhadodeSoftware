package Q8a;
import java.util.List;
import java.util.ArrayList;


public class GrupoForma implements Forma {
    private List<Forma> formas = new ArrayList<>();

    public void adicionar(Forma forma) {
        formas.add(forma);
    }

    public void remover(Forma forma) {
        formas.remove(forma);
    }

    public void desenhar() {
        System.out.println("Desenhando grupo de formas:");
        for (Forma f : formas) {
            f.desenhar();
        }
    }

    public void mover(int dx, int dy) {
        for (Forma f : formas) {
            f.mover(dx, dy);
        }
    }

    public void exibir(String identacao) {
        System.out.println(identacao + "Grupo:");
        for (Forma f : formas) {
            f.exibir(identacao + "  ");
        }
    }
}
