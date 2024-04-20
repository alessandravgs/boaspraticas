package br.unipe.respostas.oc;


import br.unipe.respostas.oc.model.CustomerInfo;
import br.unipe.respostas.oc.service.EmailService;
import br.unipe.respostas.oc.service.PurchaseService;
import lombok.Data;

// Identifique quais são as regras que , neste exemplo, a classe Customer não segue em relação a Object Calisthenics:
// Antes de olhar o arquivo texto com as respostas, tente descrever o que você identificou.
@Data
public class Customer {
    private CustomerInfo customerInfo;
    private PurchaseService purchaseService;

    public Customer(CustomerInfo customerInfo, EmailService emailService) {
        this.customerInfo = customerInfo;
        this.purchaseService = new PurchaseService(emailService);
    }

    // Getters e Setters

    public void makePurchase(double amount) {
        purchaseService.makePurchase(amount, this.customerInfo);
    }
}
