package br.unipe.respostas.oc;

import br.unipe.boaspraticas.exercicios.solid.model.Item;
import br.unipe.respostas.oc.model.Price;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {
    private List<Item> items;
    private Price price;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
}