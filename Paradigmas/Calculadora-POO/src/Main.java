
import models.Aluno;
import models.NotaAzul;
import models.NotaBaixa;


public class Main {
    public static void main(String[] args) throws Exception {
    Aluno aluno = new Aluno("Belmiro");
    aluno.adicionarNota(4);
    aluno.adicionarNota(6.5);
    aluno.adicionarNota(6.5);
    aluno.adicionarNota(8);
    
    double media = aluno.calcularMedia();
    System.out.println("Nome do Aluno: " + aluno.getNome());
    System.out.println("Média: " + media);
    
    aluno.filtrar(new NotaAzul());
    aluno.mostrarNotas("Notas Azuis: ");    
    aluno.filtrar(new NotaBaixa());
    aluno.mostrarNotas("Notas Baixas: ");

   

    }
}
