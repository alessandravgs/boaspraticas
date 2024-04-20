package br.unipe.respostas.solid.lsp.pessoas;

class Pessoa implements Som {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void fazerSom() {
        System.out.println("Oi!");
    }
}
