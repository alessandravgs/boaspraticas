package br.unipe.respostas.oc.service;

import br.unipe.boaspraticas.exercicios.solid.model.Item;
import br.unipe.respostas.oc.ShoppingCart;

public class PriceService {
    public void calculateTotalPrice(ShoppingCart shoppingCart) {
        shoppingCart.getPrice()
                .setValue(shoppingCart.getItems().stream()
                        .mapToDouble(Item::getP)
                        .sum());
    }
}
