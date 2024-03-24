package org.example;

public class PedidoOnline extends PedidoTemplate {
    public PedidoOnline(int quantidadeItens, double valorItem, String formaPagamento) {
        super(quantidadeItens, valorItem, formaPagamento);
    }

    @Override
    protected boolean decidirEntrega() {

        boolean entrega = true;
        return entrega;
    }
}