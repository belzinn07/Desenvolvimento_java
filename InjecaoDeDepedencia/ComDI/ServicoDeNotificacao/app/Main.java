package app;

import implementations.EmailNotificacao;
import abstractions.ServicoNotificacao;
import app.ClienteService;




public class Main {
    public static void main(String[] args) {
        ServicoNotificacao servicoNotificacao = new EmailNotificacao();
        ClienteService clienteService = new ClienteService(servicoNotificacao);
        clienteService.receberNotificacao("Seu pedido foi enviado!");
        



    }
}
