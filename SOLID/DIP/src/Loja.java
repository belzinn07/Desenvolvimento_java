class Loja {
    private final Pagamento pagamento;

    public Loja(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor) {
        pagamento.pagar(valor);
    }
}