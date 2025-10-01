package sistema_de_pagamentos_exemplo.implementations;
import sistema_de_pagamentos_exemplo.abstractions.Pagamento;

public class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito no Cartão de Crédito.");
        
    }
    
}