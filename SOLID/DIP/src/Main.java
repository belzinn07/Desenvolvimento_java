import implementations.PagamentoBoleto;
import implementations.PagamentoCartao;

public class Main {
    public static void main(String[] args) {
        // Inversão da dependência: injeto qualquer implementação
        Loja lojaCartao = new Loja(new PagamentoCartao());
        lojaCartao.finalizarCompra(100.0);

        Loja lojaBoleto = new Loja(new PagamentoBoleto());
        lojaBoleto.finalizarCompra(200.0);
    }
}