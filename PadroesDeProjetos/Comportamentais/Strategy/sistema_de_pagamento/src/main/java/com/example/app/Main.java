package sistema_de_pagamentos_exemplo.app;

import sistema_de_pagamentos_exemplo.implementations.PagamentoBoleto;
import sistema_de_pagamentos_exemplo.implementations.PagamentoCartao;

public class Main {
    public static void main(String[] args) {
        
        Loja lojaCartao = new Loja(new PagamentoCartao());
        lojaCartao.finalizarCompra(100.0);

        Loja lojaBoleto = new Loja(new PagamentoBoleto());
        lojaBoleto.finalizarCompra(200.0);
      
    }
}