package br.unipe.respostas.solid.sip.animais;

class Ave implements Animal, Voador {
    @Override
    public void comer() {
        System.out.println("A ave está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("A ave está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println("A ave está voando.");
    }
}
