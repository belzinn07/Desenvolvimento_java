public class ClienteService {
    
    private EmailNotificacao emailNotificacao = new EmailNotificacao();
    
    public void receberNotificacao(String mensagem) {
        emailNotificacao.notificar(mensagem);
       
    }

}
