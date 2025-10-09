
package ComDI.Servico_de_Notificacao.app;

import abstractions.ServicoNotificacao;
import implementations.EmailNotificacao;
import implementations.SMSNotificacao;



public class ClienteService {
    private ServicoNotificacao servicoNotificacao;

    public ClienteService(ServiccoNotificacao servicoNotificacao){
        this.servicoNotificacao = servicoNotificacao;

    }

    public void receberNotificacao(String mensagem) {
        servicoNotificacao.notificar(mensagem);
    }
}
