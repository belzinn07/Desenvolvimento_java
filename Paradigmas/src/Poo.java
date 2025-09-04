import java.util.List;
import java.util.Arrays;

public class Poo {
    public static void main(String[] args) throws Exception {
        
        List<Integer> notas = Arrays.asList(4,5,6,7,8,9,10);

        FiltraPoo filtro = new FiltraPoo(notas);

        List<Integer> resultado = filtro.maioresQue5();

        System.out.println("As notas maiores que 5: " + resultado);



    }
}
