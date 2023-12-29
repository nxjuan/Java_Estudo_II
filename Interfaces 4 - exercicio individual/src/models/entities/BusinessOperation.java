package models.entities;

import models.services.Operation;

public class BusinessOperation extends Business implements Operation {

    private Business business;   
    
    public BusinessOperation(){}

    public BusinessOperation(double valueContractpurchase, Business business) {
        super(valueContractpurchase);
        this.business = business;
    }

    public Business getOperation() {
        return business;
    }

    public void setOperation(Business business) {
        this.business = business;
    }

    @Override
    public double profit(double amount){
        return 0;
    }

    @Override
    public double taxes(double amount){
        return 0;
    }

    @Override
    public double investiment(double amount){
        return 0;
    }

    @Override
    public String toString() {
        return "BusinessOperation: " + getValueContractpurchase();
    }    
    
}
