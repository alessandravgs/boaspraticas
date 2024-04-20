package br.unipe.respostas.solid.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    private BigDecimal p;  // Preço do item
    private String n;  //nome do item
}
