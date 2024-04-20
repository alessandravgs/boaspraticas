package br.unipe.respostas.oc.service;

import br.unipe.boaspraticas.exercicios.solid.model.Item;
import br.unipe.respostas.oc.ShoppingCart;

import java.util.List;

public class ItemsService {

    public void addItem(ShoppingCart shoppingCart, Item item) {
        shoppingCart.getItems().add(item);
    }

    public void removeItem(ShoppingCart shoppingCart, Item item) {
        shoppingCart.getItems().remove(item);
    }

    public void printItems(ShoppingCart shoppingCart) {
        shoppingCart.getItems()
                .forEach(item -> System.out.println(item.getN() + " - $" + item.getP()));
    }
}
