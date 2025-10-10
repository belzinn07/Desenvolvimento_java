
public class Main {
    public static void main(String[] args) {
      ServicoNotificacao notificacao = new EmailNotificacao();
      ClienteService cliente = new ClienteService(notificacao);
      cliente.enviarNotificacao("Olá, bem-vindo ao sistema!");


    }

}