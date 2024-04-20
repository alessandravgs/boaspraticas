package br.unipe.respostas.solid.model;


import lombok.Data;

@Data
public class ItemCompra {
    private String n;  //NOME da pessoa realizando compra

    private double pu; //Preço da compra
    private int qtd;  // Quantidade de itens

}
