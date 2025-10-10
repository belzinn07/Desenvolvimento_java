

import Sem_DI.abstractions.ServicoNotificacao;

public class EmailNotificacao implements ServicoNotificacaoacao{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação por email: " + mensagem);
    }
}