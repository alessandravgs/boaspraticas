package br.unipe.respostas.solid.lsp.formas;

class Square extends Shape implements Forma {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um quadrado.");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}