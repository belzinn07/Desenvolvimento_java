import java.util.ArrayList;//importa a classe ArrayList
import java.util.Arrays;//importa a classe Array
import java.util.List; //importa a interface List

public class Collections {

    public static void main(String[] args) {
        List <Integer> notas = new ArrayList<>(Arrays.asList(5,6,7,8,9,10)); 

          //aplicando filtros   
        List <Integer> maioresQue7 = filtrar(notas, Collections::maiorQue7);    

        System.out.println(maioresQue7);

    }
    

}
