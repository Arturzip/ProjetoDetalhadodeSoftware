package Q7a;

class BibliotecaLegada2 {
    public String obterDados() {
        return "Aluno: Maria Souza | Dados em formato legado 2";
    }
}
class AdapterLegado2 implements AlunoServico {
    private BibliotecaLegada2 legado2;

    public AdapterLegado2(BibliotecaLegada2 legado2) {
        this.legado2 = legado2;
    }

    @Override
    public String getDadosAluno() {
        return legado2.obterDados();
    }
}
