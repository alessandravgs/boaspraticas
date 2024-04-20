package br.unipe.respostas.solid.dip;

class BancoDeDados implements InterfaceBancoDeDados {
    // Lógica para salvar o pedido no banco de dados
    @Override
    public void salvarPedido(Pedido pedido) {
        // Código para salvar o pedido no banco de dados
        System.out.println("Salvando pedido");
    }
}
