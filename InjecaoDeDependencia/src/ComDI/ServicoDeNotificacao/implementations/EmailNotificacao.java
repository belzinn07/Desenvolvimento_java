package implementations;

public class EmailNotificacao implements ServicoNotificacao{
    @Override
    public void notificar(String mensagem){
        System.out.println("Notificando via e-mail: " + mensagem);

    }
}