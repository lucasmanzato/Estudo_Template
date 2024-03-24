package org.example;

public class PedidoCriptomoedas extends PedidoTemplate {
    public PedidoCriptomoedas(int quantidadeItens, double valorItem, String formaPagamento) {
        super(quantidadeItens, valorItem, formaPagamento);
    }

    @Override
    protected boolean decidirEntrega() {

        boolean entrega = true;
        return entrega;
    }

    @Override
    protected void realizarEntrega() {
        System.out.println("Pedido em rota de entrega");
    }
}
