import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MapDeclarativo {

    public static void main(String[] args) {
           System.out.println("-----Avaliação Bimestral-----");
           System.out.println();
           System.out.println("Recuperação: ");
         Map<String, Integer> notas = new HashMap<>();

    notas.put("Bel", 9);
    notas.put("Ana", 10);
    notas.put("Tiago",10 );
    notas.put("Belo", 5);

    Predicate<Map.Entry<String, Integer>> notasBaixas = n -> n.getValue() < 6;
    Consumer<Map.Entry<String, Integer>> exibaRecuperacao =  n ->  System.out.println(
            n.getKey() + " tirou nota " + n.getValue() + " e precisa fazer recuperação");
    Consumer<Map.Entry<String, Integer>> atualizarNotas = 
    e -> e.setValue(e.getValue() + (6 - e.getValue()) * (e.getValue() < 6 ? 1 : 0));
     Consumer<Map.Entry<String, Integer>> notasAtualizadas = entry ->
            System.out.println("Aluno " + entry.getKey() + " tem nota: " + entry.getValue());



    notas.entrySet().stream()
                    .filter(notasBaixas)
                    .peek(exibaRecuperacao)
                    .forEach(atualizarNotas);
                
         System.out.println();
       System.out.println("---Notas atualizadas após recuperação: ");
    notas.entrySet()
         .forEach(notasAtualizadas);  
                     

    }

}
