package br.unipe.respostas.oc.service;

import br.unipe.respostas.oc.ShoppingCart;
import br.unipe.respostas.oc.model.CustomerInfo;

public class EmailService {

    public void sendEmailReceipt(CustomerInfo customer, double amount) {
        // Lógica para enviar um e-mail com o recibo da compra
        System.out.println("Email receipt sent. Amount: " + amount);
    }

    public void sendConfirmationEmail(ShoppingCart shoppingCart) {
        System.out.println("Confirmation email");
    }
}
