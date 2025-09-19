package abstracoes;
import java.util.List;

public interface GerenciarNotas  {
    double calcularMedia();
    void mostrarNotas(String mensagem);
    
}


public interface Filtro{
    List<Double> filtrar(List<Double> notas);
}

