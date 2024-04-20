package br.unipe.respostas.solid.dip;


//Nesse exemplo, a classe Pedido possui uma dependência direta da classe concreta BancoDeDados. Isso viola o
// Princípio da Inversão de Dependência, pois a classe de alto nível (Pedido) está dependendo diretamente de uma classe
// de baixo nível (BancoDeDados). Isso torna o código mais rígido e difícil de modificar,
// pois qualquer alteração no BancoDeDados pode impactar a classe Pedido.
class Pedido {
    private InterfaceBancoDeDados bancoDeDados;

    public Pedido(InterfaceBancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public void salvar() {
        bancoDeDados.salvarPedido(this);
    }
}
