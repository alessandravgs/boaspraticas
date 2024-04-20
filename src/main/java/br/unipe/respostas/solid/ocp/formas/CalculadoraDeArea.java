package br.unipe.respostas.solid.ocp.formas;

import br.unipe.boaspraticas.exercicios.solid.model.FormaGeometrica;

import java.util.Arrays;


// Neste exemplo, temos uma classe CalculadoraDeArea que calcula a área total de um conjunto de
// formas geométricas. Porém, para adicionar uma nova forma geométrica, é necessário modificar a classe CalculadoraDeArea para lidar com o novo tipo, o que também viola o OCP.
// Classe que calcula a área total de um conjunto de formas geométricas
public class CalculadoraDeArea {
    public double calcularAreaTotal(FormaGeometrica[] forms) {
        return Arrays.stream(forms)
                .mapToDouble(FormaGeometrica::calcularArea)
                .sum();
    }
}
