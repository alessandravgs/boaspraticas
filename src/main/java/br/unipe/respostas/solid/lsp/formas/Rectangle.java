package br.unipe.respostas.solid.lsp.formas;

import lombok.Data;

class Rectangle extends Shape implements Forma {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um retângulo.");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
