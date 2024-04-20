package br.unipe.respostas.solid.sip.animais;

class Peixe implements Animal, Nadador {
    @Override
    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O peixe está dormindo.");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}
