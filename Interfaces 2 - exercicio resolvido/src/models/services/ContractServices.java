package models.services;

import java.time.LocalDate;

import models.entities.Contract;
import models.entities.Installment;

public class ContractServices {
    private PaymentService paymentService;   

    public ContractServices() {
    }

    public ContractServices(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int parcelas){
        double basicAmaount = contract.getTotalValue() / parcelas;
        for(int i = 1; i <= parcelas; i++){
            LocalDate duoDate = contract.getData().plusMonths(i);
            double interest = paymentService.interest(basicAmaount, i);
            double paymentFee = paymentService.paymentFee(basicAmaount + interest);
            double amount = basicAmaount + paymentFee + interest;
            contract.getInstallments().add(new Installment(duoDate, amount));
        }
    }
}
