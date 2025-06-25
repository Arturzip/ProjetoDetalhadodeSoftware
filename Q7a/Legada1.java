package Q7a;

class BibliotecaLegada1 {
    public String buscarInfoAluno() {
        return "Aluno: João Silva - Formato Legado 1";
    }
}

class AdapterLegado1 implements AlunoServico {
    private BibliotecaLegada1 legado1;

    public AdapterLegado1(BibliotecaLegada1 legado1) {
        this.legado1 = legado1;
    }

    @Override
    public String getDadosAluno() {
        return legado1.buscarInfoAluno();
    }
}
