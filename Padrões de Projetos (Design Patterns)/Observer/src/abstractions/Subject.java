package abstractions;

public interface Subject {
    void adicicionarObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificarObservadores(String message);

}
