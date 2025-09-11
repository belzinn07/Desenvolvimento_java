import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MapDeclarativo {

    public static void main(String[] args) {
           System.out.println("-----Avaliação Bimestral-----");
         Map<String, Integer> notas = new HashMap<>();

    notas.put("Bel", 9);
    notas.put("Ana", 10);
    notas.put("Tiago",10 );
    notas.put("Belo", 5);


    Predicate<Map.Entry<String, Integer>> notaBaixa = n -> n.getValue() < 6;
    

    Double media=notas.values()
                      .stream()
                       .mapToInt(Integer::intValue)   
                       .average()
                       .orElse(0);


    notas.entrySet().stream()
                    .filter(notaBaixa)
                    .forEach(n ->  System.out.println(
            n.getKey() + " tirou nota " + n.getValue() + " e precisa fazer recuperação"));
                   


    }

}
