package br.unipe.respostas.solid.ocp.formas;

import lombok.Data;

@Data
public class Circulo implements CalculosFormas {
    private double raio;

    // Construtor, getters e setters omitidos

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
