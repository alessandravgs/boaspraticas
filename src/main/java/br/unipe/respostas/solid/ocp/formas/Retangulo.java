package br.unipe.respostas.solid.ocp.formas;

import lombok.Data;

@Data
public class Retangulo implements CalculosFormas {
    private double altura;
    private double largura;

    // Construtor, getters e setters omitidos

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
