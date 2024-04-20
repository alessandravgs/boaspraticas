package br.unipe.respostas.solid.srp;

import br.unipe.respostas.solid.model.Item;
import lombok.Data;

import java.util.List;


@Data
public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;
}
