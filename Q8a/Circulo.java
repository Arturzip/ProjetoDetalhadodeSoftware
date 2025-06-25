package Q8a;

public class Circulo implements Forma {
    private int x, y;

    public Circulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar() {
        System.out.println("Desenhando um círculo na posição (" + x + ", " + y + ")");
    }

    public void mover(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Movendo circulo para as (" + x + ", " + y + ")");
    }

    public void exibir(String identacao) {
        System.out.println(identacao + "Circulo (" + x + "," + y + ")");
    }
}

