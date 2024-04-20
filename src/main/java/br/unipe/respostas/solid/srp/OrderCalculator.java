package br.unipe.respostas.solid.srp;

import br.unipe.respostas.solid.model.Item;
import java.math.BigDecimal;

public class OrderCalculator {

    public void calculateTotalPrice(Order order) {
        BigDecimal total = order.getItems().stream()
                .map(Item::getP)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total Price: " + total);
    }

}
