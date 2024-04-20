package br.unipe.respostas.solid.sip.trabalhadores;

class Gerente implements TrabalhadorTemporario, TrabalhadorIntegral {
    @Override
    public void trabalharEmTempoIntegral() {
        // Implementação do trabalho em tempo integral para um gerente
        System.out.println("Gerente trabalhando em tempo integral.");
    }

    @Override
    public void fazerTrabalhoTemporario() {
        // Implementação do trabalho temporário para um gerente
        System.out.println("Gerente também faz trabalhos temporários.");
    }
}
