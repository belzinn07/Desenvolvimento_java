import java.util.ArrayList;
import java.util.List;

public class FiltraPoo {

    private List<Integer> notas;

    //construtor
    public FiltraPoo(List<Integer> notas){
        this.notas= notas;

    }

     //
    public List<Integer> maioresQue5() {
        List<Integer> lista = new ArrayList<>();
        for (Integer n : notas){
            if (n>5) {
                lista.add(n);
                
            }
        }

        return lista;

    }


}
