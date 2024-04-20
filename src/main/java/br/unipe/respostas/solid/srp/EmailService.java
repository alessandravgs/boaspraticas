package br.unipe.respostas.solid.srp;

public class EmailService {

    public void sendConfirmationEmail(Order order) {
        // Código para enviar e-mail de confirmação para o cliente
        System.out.println("Enviando e-mail para: "+ order.getCustomerName());
    }

}
