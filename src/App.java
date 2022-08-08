
public class App {
    public static void main(String[] args) throws Exception {
        Arquivo arquivo = new Arquivo();
        EntrevistadoVetor entrevistadoVetor = arquivo.carregarEntrevistadoVetor("src/Entrevistados.csv");
        entrevistadoVetor.exibirRelatorio();
        arquivo.gravar(entrevistadoVetor.exibirRelatorio(),"src/Relatorio.csv");
    }
}
