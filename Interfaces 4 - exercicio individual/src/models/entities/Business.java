package models.entities;

import models.services.Operation;

public abstract class Business implements Operation{

    private double valueContractpurchase;

    public Business(){

    }

    public Business(double valueContractpurchase) {
        this.valueContractpurchase = valueContractpurchase;
    }

    public double getValueContractpurchase() {
        return valueContractpurchase;
    }     

    public abstract double profit(double amount);
    public abstract double taxes(double amount);
    public abstract double investiment(double amount);
}
