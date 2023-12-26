package models.services;

public class PayPalService implements PaymentService{

    public double paymentFee(double amount){
        return amount * 0.02;
    }

    public double interest(double amount, Integer months){
        return amount * (months * 0.01);
    }
}
