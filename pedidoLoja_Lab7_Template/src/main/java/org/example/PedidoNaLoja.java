package org.example;

public class PedidoNaLoja extends PedidoTemplate {
    public PedidoNaLoja(int quantidadeItens, double valorItem, String formaPagamento) {
        super(quantidadeItens, valorItem, formaPagamento);
    }

    @Override
    protected boolean decidirEntrega() {

        boolean entrega = false;
        return entrega;
    }
}