package implementations;
import abstractions.Subject;    
import  abstractions.Observer;
import java.util.ArrayList; 
import java.util.List;

public class GerenciadordeTarefas implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<String> tarefas = new ArrayList<>();


    @Override
    public void adicicionarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notificarObservadores(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
        
    }

    public void criarTarefa(String tarefa){
        tarefas.add(tarefa);
        notificarObservadores("Nova tarefa criada: " + tarefa);
    }


    public void removerTarefa(String tarefa){
        System.out.println("Tarefa removida:" + tarefa);
        notificarObservadores(tarefa);
    }

    
    public void atualizarTarefa(String novaTarefa){
        System.out.println("Tarefa atualizada: " + novaTarefa);
        notificarObservadores(novaTarefa);
       
    }
   
    public List<String> getTarefas() {
        return tarefas;
    }




    

}
