package br.unipe.respostas.solid.lsp.pessoas;

class Funcionario extends Pessoa implements Som {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    // Sobrescrevendo o método fazerSom() na classe Funcionario
    @Override
    public void fazerSom() {
        System.out.println("Bom dia!");
    }

    // Método específico da classe Funcionario
    public void calcularSalario() {
        // Lógica para calcular o salário do funcionário
    }
}
