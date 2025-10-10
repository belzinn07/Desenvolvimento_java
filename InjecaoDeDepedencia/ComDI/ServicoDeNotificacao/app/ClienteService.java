package app;

import abstractions.ServicoNotificacao;

public class ClienteService {
    private ServicoNotificacao servicoNotificacao;

    public ClienteService(ServicoNotificacao servicoNotificacao){
        this.servicoNotificacao = servicoNotificacao;

    }

    public void receberNotificacao(String mensagem) {
        servicoNotificacao.notificar(mensagem);
    }
}
