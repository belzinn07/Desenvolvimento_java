package sistema_de_pagamentos_exemplo.app;
import sistema_de_pagamentos_exemplo.abstractions.*;;            

public class Loja {
    private final Pagamento pagamento;

    public Loja(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor) {
        pagamento.pagar(valor);
    }
}