package br.unipe.respostas.oc.service;

import br.unipe.respostas.oc.model.TotalPurchaseAmount;
import br.unipe.respostas.oc.model.CustomerInfo;
import lombok.Data;

@Data
public class PurchaseService {
    private TotalPurchaseAmount totalPurchaseAmount;
    private EmailService emailService;

    public PurchaseService(EmailService emailService) {
        this.totalPurchaseAmount = new TotalPurchaseAmount(0);
        this.emailService = emailService;
    }

    public void addToTotalPurchaseAmount(double amount) {
        this.totalPurchaseAmount.setValue(this.totalPurchaseAmount.getValue() + amount);
    }

    public void makePurchase(double amount, CustomerInfo customerInfo) {
        if (amount <= 0) {
            System.out.println("Invalid purchase amount!");
            return;
        }

        addToTotalPurchaseAmount(amount);
        System.out.println("Purchase successful!");

        if (customerInfo.getAge().isAdult()) {
            emailService.sendEmailReceipt(customerInfo, amount);
        }
    }
}
