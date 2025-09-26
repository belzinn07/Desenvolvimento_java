
public class Main {
    public static void main(String[] args) {
        
        Loja lojaCartao = new Loja(new PagamentoCartao());
        lojaCartao.finalizarCompra(100.0);

        Loja lojaBoleto = new Loja(new PagamentoBoleto());
        lojaBoleto.finalizarCompra(200.0);
    }
}