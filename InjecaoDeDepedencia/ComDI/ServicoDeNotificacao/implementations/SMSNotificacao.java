package implementations;

import abstractions.ServicoNotificacao;

public class SMSNotificacao implements ServicoNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação por SMS: " + mensagem);
    }
}
