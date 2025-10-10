package service;


public class ClienteService {
    private ServicoNotificacao servicoNotificacao;

    public ClienteService(ServicoNotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void enviarNotificacao(String mensagem) {
        servicoNotificacao.notificar(mensagem);
    }



}