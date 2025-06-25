package Q8a;

public class Quadrado implements Forma {
    private int x, y;

    public Quadrado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar() {
        System.out.println("Desenhando um quadrado na posicao (" + x + ", " + y + ")");
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Movendo quadrado para (" + x + ", " + y + ")");
    }

    public void exibir(String identacao) {
        System.out.println(identacao + "Quadrado (" + x + "," + y + ")");
    }
}

