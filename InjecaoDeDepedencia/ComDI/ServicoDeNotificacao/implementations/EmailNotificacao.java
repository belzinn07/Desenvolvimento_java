package implementations;

import ServiçoDeNotificacao.abstractions.ServicoNotificacao;

public class EmailNotificacao implements ServicoNotificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação por email: " + mensagem);
    }
}
