package app;
import abstractions.Observer;
import implementations.GerenciadordeTarefas;
import implementations.Observador;




public class Aplicacao {
      
     
    public void executar(){
    
    GerenciadordeTarefas gerenciador = new GerenciadordeTarefas();
     
    Observer obs1 = new Observador("Belmiro ");
    Observer obs2 = new Observador("Tiago ");
    Observer obs3 = new Observador("Ana");
     
    gerenciador.adicicionarObservador(obs1);
    gerenciador.adicicionarObservador(obs2);
    gerenciador.adicicionarObservador(obs3);

    gerenciador.criarTarefa("Estudar Padrões de Projetos");
    gerenciador.atualizarTarefa("Estudar Padrão Observer");
    gerenciador.removerTarefa("Estudar Padrões de Projetos");

    }

}
