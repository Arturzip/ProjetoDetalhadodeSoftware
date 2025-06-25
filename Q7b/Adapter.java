package Q7b;
//por composição ja foi criado em Q7a
//por herança:
class AdapterLegado1_Heranca extends BibliotecaLegada1 implements AlunoServico {
    public String getDadosAluno() {
        return buscarInfoAluno();
    }
}

