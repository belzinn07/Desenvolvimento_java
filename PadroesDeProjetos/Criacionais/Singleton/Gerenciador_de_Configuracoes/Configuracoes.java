import java.util.Map;
import java.util.HashMap;

public class Configuracoes {
   private static Configuracoes instancia;
   private Map<String, String> valores;

   private Configuracoes(){
    valores = new HashMap<>();
   }

   public static Configuracoes getInstance(){
    if(instancia == null){
        instancia = new Configuracoes();
    }
    return instancia;
   }

   public void salvar(String chave, String valor){
    valores.put(chave, valor);
   }

   public String obter(String chave){
    return valores.get(chave);

   }

   public void remover(String chave){
    valores.remove(chave);
   }
    

}
