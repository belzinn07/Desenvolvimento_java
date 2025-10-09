public class EmailNotificacao implements ServicoNotificacao {
    @Override
    public void notificar(String mensgaem) {
        System.out.println("Enviando notificação por email: " + mensgaem);
    }
    
}
