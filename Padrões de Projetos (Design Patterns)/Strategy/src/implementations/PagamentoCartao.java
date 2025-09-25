package implementations;
import abstractions.Pagamento;

class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito no Cartão de Crédito.");
        
    }
    
}