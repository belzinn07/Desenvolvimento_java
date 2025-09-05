
public class Main {
    public static void main(String[] args) throws Exception {
    Boletim boletim = new Boletim("Belmiro");
    boletim.adicionarNota(4);
    boletim.adicionarNota(5.5);
    boletim.adicionarNota(6.5);
    boletim.adicionarNota(8);
    
    double media = boletim
    .isNotaAzul()
    .isNotaBaixa()
    .calcularMedia();


    System.out.println("Nome do aluno: " + boletim.getNome());
    System.out.println("Média do aluno: "+media);
    boletim.isNotaAzul().mostrarNotas("Notas azuis: ");
    boletim.isNotaBaixa().mostrarNotas("Notas baixas: ");
    
    

    }
}
