package br.unipe.respostas.solid.ocp.CalculoCompra;

import br.unipe.respostas.solid.model.Compra;

public class CompraComDesconto implements Desconto{
    private double desconto;

    public CompraComDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double aplicarDesconto(double total) {
        if(desconto <= 0)
            return total;

        return total - (total * desconto / 100);
    }
}
