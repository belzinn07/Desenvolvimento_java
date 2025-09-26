package implementations;
public class Observador  implements abstractions.Observer{
   private String nome;

    public Observador( String nome) {
         this.nome = nome;
    }

    @Override
    public void update(String message) {
        System.out.println(nome + " recebeu a notificação: " + message);
    }
}
