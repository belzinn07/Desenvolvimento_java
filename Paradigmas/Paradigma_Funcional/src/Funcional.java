import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

//Algoritmo de pegar as notas maiores que 5, fazer a média e exibir as notas baixas
public class Funcional {

    public static void main(String[] args) {
        List<Integer> notas = Arrays.asList(4,5,6,7,8,9,10);

        Predicate<Integer>  maioresQue5 = nota -> nota>5;

        List<Integer> maiorQue5 = notas.stream()
        .filter(n->n>5)
        .toList();
        System.out.println("As notas maiores que 5 são: " + maiorQue5);//exibe os maiores que 5
       
        double media = notas.stream()
        .filter(maioresQue5::test)
        .mapToInt(n->n)
        .average()
        .orElse(0.0);

         System.out.printf("Média das notas maiores que 5 : " + media);

         List<Integer> notasBaixas = notas.stream()
         .filter(n-> n<=5)
         .toList();
          System.out.println(" As notas baixas são: " + notasBaixas);




        
    }


}
