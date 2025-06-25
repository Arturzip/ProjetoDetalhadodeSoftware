package Q7a;

public class SistemaGestaoEscolar {
    public static void main(String[] args) {
        BibliotecaLegada1 legado1 = new BibliotecaLegada1();
        BibliotecaLegada2 legado2 = new BibliotecaLegada2();

        AlunoServico aluno1 = new AdapterLegado1(legado1);
        AlunoServico aluno2 = new AdapterLegado2(legado2);

        System.out.println(aluno1.getDadosAluno());
        System.out.println(aluno2.getDadosAluno());
    }
}