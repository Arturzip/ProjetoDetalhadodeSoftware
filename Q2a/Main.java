package Q2a;

public class Main {
    public static void main(String[] args) {
        AnaliseDados analise1 = new AnaliseEstatistica();
        analise1.executarAnalise();

        System.out.println();

        AnaliseDados analise2 = new AnaliseMachineLearning();
        analise2.executarAnalise();
    }
}
